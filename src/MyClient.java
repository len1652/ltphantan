
import bean.taikhoanbean;
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phucp
 */
public class MyClient {
    public static void main(String[] args) {
    try{
    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost:1099/TinhToan");
    System.out.println(tt.Cong(10,20) );
    System.out.println(tt.Tru(10,20) );
    System.out.println(tt.Nhan(10,20) );
    System.out.println(tt.Chia(100,20) );
        taikhoanbean tk = tt.ktdn("abc", "123");
        if(tk!=null){
            System.out.println(tk.getSoTien());
        }
        else{
            System.out.println("Dang nhap sai");
        }
    }catch(Exception tt) {System.out.print(tt);}
  }
}



