
import bean.taikhoanbean;
import java.rmi.Remote;

public interface ITinhToan extends Remote{
    public int Cong (int a, int b) throws Exception;
    public int Tru (int a, int b) throws Exception;
    public int Nhan (int a, int b) throws Exception;
    public int Chia (int a, int b) throws Exception;
    public taikhoanbean ktdn(String sotaikhoan,  String matkhau) throws Exception;
    public void ruttien(long sotien,taikhoanbean tk)throws Exception;
}
