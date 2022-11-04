
import bean.taikhoanbean;
import bo.taikhoanbo;
import dao.dangnhapdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class TinhToan extends UnicastRemoteObject implements ITinhToan{

    public TinhToan() throws RemoteException {
    }
    
    @Override
    public int Cong(int a, int b) throws Exception {
        int s=a+b;
        System.out.println("Tong: "+s );
        return a+b;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s=a-b;
        System.out.println("Tong: "+s );
        return a-b;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        System.out.println(a*b);
        return a*b;
    }

    @Override
    public int Chia(int a, int b) throws Exception {
        System.out.println(a/b);
        return a/b;
    }
    dangnhapdao dn = new dangnhapdao();
    @Override
    public taikhoanbean ktdn(String sotaikhoan, String matkhau) throws Exception {
        
        return dn.ktdn(sotaikhoan, matkhau);
    }
    taikhoanbo tkbo = new taikhoanbo();
    public taikhoanbean ruttien(long sotien, taikhoanbean tk) throws Exception {
        taikhoanbean tkhoan =  tkbo.rutien(sotien, tk);
        return tk;
    }
    
}
