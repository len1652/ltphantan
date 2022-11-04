
package bo;

import bean.taikhoanbean;
import dao.KetNoi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class taikhoanbo {
    
    public taikhoanbo() {
        
    }
    public taikhoanbean rutien(long sotien,taikhoanbean tk){
        System.out.println("số tiền trước khi trừ: "+tk.getSoTien());
            try {
            if (tk.getSoTien()>sotien){
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                
                String sql = "UPDATE TaiKhoan SET SoTien = ? WHERE SoTaiKhoan = ?";
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                long du = tk.getSoTien()-sotien;
                cmd.setString(1, String.valueOf(du));
                tk.setSoTien(du);
                System.out.println("Số tiền của tài khoản đang xử lý: " + du);
                cmd.setString(2, tk.getSoTaiKhoan());
                
                ResultSet rs = cmd.executeQuery();
                
                rs.close();
                kn.cn.close();
                
                
                
                
                
            }
        } catch (Exception e) {
        }
        return tk;
    }
}
