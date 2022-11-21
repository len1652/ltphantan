
import bean.chitiettaikhoanbean;
import bean.taikhoanbean;
import bo.chitiettaikhoanbo;
import bo.taikhoanbo;
import dao.dangnhapdao;
import dao.taikhoanchuyendao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


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
        return tkhoan;
    }

    @Override
    public taikhoanbean chuyentien(taikhoanbean tkg, taikhoanbean tkn, long sotien) throws Exception {
        taikhoanbean tkhoan =  tkbo.chuyentien(tkg, tkn,sotien);
        return tkhoan;
    }
    
    taikhoanchuyendao tkchuyendao= new taikhoanchuyendao();
    @Override
    public taikhoanbean kttk(String sotaikhoan) throws Exception {
        System.out.println("sai o day");
        return tkchuyendao.kttkhoan(sotaikhoan);
    }

    @Override
    public ArrayList<chitiettaikhoanbean> lsdd(String stk) throws Exception {
         chitiettaikhoanbo lsubo = new chitiettaikhoanbo();
         ArrayList<chitiettaikhoanbean> ds = lsubo.getls(stk);
         return ds;
    }
    
}
