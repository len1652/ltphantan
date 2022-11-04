/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author phucp
 */
public class dangnhapdao {
    public taikhoanbean ktdn (String sotaikhoan,  String matkhau){
        // ketnoi vao csdl
        taikhoanbean tk = null;
        try {
            KetNoi kn = new KetNoi();
        kn.KetNoi();
        //b2: lay du lieu ve
        String sql = "select * from TaiKhoan where SoTaiKhoan=? and MatKhau=?";
        PreparedStatement cmd = kn.cn.prepareStatement(sql);
        cmd.setString(1, sotaikhoan);
        cmd.setString(2, matkhau);
        ResultSet rs = cmd.executeQuery();
        
        if(rs.next()){
            String SoTaiKhoan =rs.getString("SoTaiKhoan");
            String HoTen =rs.getString("HoTen");
            long SoTien=rs.getLong("SoTien");
            String MatKhau = rs.getString("MatKhau");
            tk =  new taikhoanbean(SoTaiKhoan, HoTen, SoTien, MatKhau);
        }
        rs.close();
        kn.cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
}
