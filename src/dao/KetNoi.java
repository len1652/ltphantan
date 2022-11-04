/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoi {
    public Connection cn;
    public void KetNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://Cen\\sqlexpress:1433;databaseName=QLTaiKhoan;user=sa; password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Connected da xong buoc 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		KetNoi kn = new KetNoi();
		kn.KetNoi();

	}
}
