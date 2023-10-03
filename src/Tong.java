public class Tong {
    private int n;
    public long Tinh(){
        if (n==0)
            return n;
        long t=0;
        for (int i=1; i<=n; i++){
            t+=i;
        }
        return t;
    }
    public long TinhDeQuy(long n){
        if (n > 0) {
            return n + TinhDeQuy(n - 1);
        } else {
            return 0;
        }
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
