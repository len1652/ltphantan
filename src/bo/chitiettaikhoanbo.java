/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.chitiettaikhoanbean;
import dao.chittiettaikhoandao;
import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author phucp
 */
public class chitiettaikhoanbo {
    chittiettaikhoandao ctietdao = new chittiettaikhoandao();
    ArrayList<chitiettaikhoanbean> ds;
    ArrayList<chitiettaikhoanbean> ds2;
    public chitiettaikhoanbo() {
    }
    
    public ArrayList<chitiettaikhoanbean> getls (String tentaikhoan){
         
        ds2 = new ArrayList<chitiettaikhoanbean>(); ;
        ds = ctietdao.getchitiettaikhoan();
        for ( int i = 0 ; i < ds.size(); i++){
            if (ds.get(i).getSoTaiKhoan().equals(tentaikhoan)){
                ds2.add(ds.get(i));
            }
        }
        
        return ds2 ; 
    }
    public static void main(String[] args) {
        ArrayList<chitiettaikhoanbean> ds;
        chitiettaikhoanbo bo = new chitiettaikhoanbo();
        ds = bo.getls("xyz");
        System.out.println(ds.get(0).getSoTienRutRa());
    }
    
}
