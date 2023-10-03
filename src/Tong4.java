public class Tong4 {
    private int n;
    public long Tinh(){
        if (n==0)
            return n;
        long t=0;
        for (int i=1; i<=n; i++){
            t+=i*(i+1);
        }
        return t;
    }
    public long TinhDeQuy(long n){
        if (n==0)
            return 0;
        return n*(n+1)+TinhDeQuy(n-1);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
