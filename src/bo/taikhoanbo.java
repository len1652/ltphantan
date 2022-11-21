
package bo;

import bean.taikhoanbean;
import dao.KetNoi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;


public class taikhoanbo {
    
    public taikhoanbo() {
        
    }
    public taikhoanbean rutien(long sotien,taikhoanbean tk){
            try {
            if (tk.getSoTien()>sotien){
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                
                String sql = "UPDATE TaiKhoan SET SoTien = ? WHERE SoTaiKhoan = ? "
                        + "INSERT INTO ChiTietTaiKhoan VALUES (?,?,?,?)";
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                long du = tk.getSoTien()-sotien;
                cmd.setString(1, String.valueOf(du));
                tk.setSoTien(du);
                SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("Số tiền của tài khoản đang xử lý: " + du);
                cmd.setString(2, tk.getSoTaiKhoan());
                
//                cmd.setString(3, dd.format(java.time.LocalDate.now()));
                cmd.setString(3, "2022-8-11");
                cmd.setString(4, String.valueOf(sotien));
                cmd.setString(5, tk.getSoTaiKhoan());
                cmd.setString(6, "rut tien");
                
                ResultSet rs = cmd.executeQuery();
                
                rs.close();
                kn.cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
    
    public taikhoanbean chuyentien(taikhoanbean tkg, taikhoanbean tkn, long sotien){
        try {
            if (tkg.getSoTien()>sotien){
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                
                String sql = "UPDATE TaiKhoan SET SoTien = ? WHERE SoTaiKhoan = ? "
                        + "UPDATE TaiKhoan SET SoTien = ? WHERE SoTaiKhoan = ?";
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                long du = tkg.getSoTien()-sotien;
                cmd.setString(1, String.valueOf(du));
                tkg.setSoTien(du);
                System.out.println("Số tiền của tài khoản đang xử lý: " + du);
                cmd.setString(2, tkg.getSoTaiKhoan());
                
                long nhan = tkn.getSoTien()+sotien;
                cmd.setString(3, String.valueOf(nhan));
                tkg.setSoTien(du);
                System.out.println("Số tiền của tài khoản đang xử lý: " + nhan);
                cmd.setString(4, tkn.getSoTaiKhoan());
                
                ResultSet rs = cmd.executeQuery();
                
                rs.close();
                kn.cn.close();
                
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkg;
    }

   
}
