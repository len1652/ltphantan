
import bean.chitiettaikhoanbean;
import bean.taikhoanbean;
import java.rmi.Remote;
import java.util.ArrayList;

public interface ITinhToan extends Remote{
    public int Cong (int a, int b) throws Exception;
    public int Tru (int a, int b) throws Exception;
    public int Nhan (int a, int b) throws Exception;
    public int Chia (int a, int b) throws Exception;
    public taikhoanbean ktdn(String sotaikhoan,  String matkhau) throws Exception;
    public taikhoanbean kttk(String sotaikhoan)throws Exception;
    public taikhoanbean ruttien(long sotien,taikhoanbean tk)throws Exception;
    public taikhoanbean chuyentien(taikhoanbean tkg,taikhoanbean tkn, long sotien )throws Exception;
    public ArrayList<chitiettaikhoanbean> lsdd (String stk)throws Exception;
}
