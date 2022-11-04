
package dao;

import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class taikhoandao {
    public ArrayList<taikhoanbean> gettaikhoan(){
        ArrayList<taikhoanbean> ds = new ArrayList<taikhoanbean>();
        try {
            KetNoi kn =new KetNoi();
            kn.KetNoi();

            String sql = "select*from TaiKhoan";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
       
            while (rs.next()) {
                String SoTaiKhoan =rs.getString("SoTaiKhoan");
                String HoTen =rs.getString("HoTen");
                long SoTien=rs.getLong("SoTien");
                String MatKhau = rs.getString("MatKhau");
            }
            rs.close();
            kn.cn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        return ds;
    }
}
