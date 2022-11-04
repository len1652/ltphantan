
public class TinhToan implements ITinhToan{

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
    
}
