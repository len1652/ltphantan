
package dao;

import bean.chitiettaikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;


public class chittiettaikhoandao {
    public ArrayList<chitiettaikhoanbean> getchitiettaikhoan(){
        ArrayList<chitiettaikhoanbean> ds = new ArrayList<chitiettaikhoanbean>();
        try {
            KetNoi kn =new KetNoi();
            kn.KetNoi();

            String sql = "select*from ChiTietTaiKhoan";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
       
            while (rs.next()) {
                int Id = rs.getInt("Id");
                Date NgayRutTien = rs.getDate("NgayRutTien");
                long SoTienRutRa = rs.getLong("SoTienRutRa");
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String GhiChu = rs.getString("GhiChu");
                ds.add(new chitiettaikhoanbean(Id, NgayRutTien, SoTienRutRa, SoTaiKhoan, GhiChu));
            }
            rs.close();
            kn.cn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        return ds;
    }
    
}
