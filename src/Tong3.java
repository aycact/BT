public class Tong3 {
    private int n;
    public double Tinh(){
        double S=0;
        if (n==0)
            return -1;
        for(int i = 1; i <= n; i++){
            S = S + 1 / i;
        }
        return S;
    }
    public long TinhDeQuy(long n){
        if (n == 1) 
            return 1;
        return (1/n)+TinhDeQuy(n-1);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
