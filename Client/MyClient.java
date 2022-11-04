
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
    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
    System.out.print(tt.Cong(10,20) );
    System.out.print(tt.Tru(10,20) );
    System.out.print(tt.Nhan(10,20) );
    System.out.print(tt.Chia(10,20) );
    }catch(Exception tt) {System.out.print(tt);}
  }
}



