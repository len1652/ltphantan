
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MySever {
    
    public static void main(String[] args) {
    try{
     TinhToan tt= new TinhToan();
        LocateRegistry.createRegistry(1099);
     //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
//     UnicastRemoteObject.exportObject(tt);
     //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
     Naming.bind("rmi://localhost/TinhToan",tt);
     System.out.print("Da cho may khach goi den:");
    }catch(Exception tt)   { System.out.print(tt);    }
  }
}
