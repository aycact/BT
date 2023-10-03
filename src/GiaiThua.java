public class GiaiThua {
    private int n;
    public long Tinh(){
        long gt=1;
        if (n==2 || n==1 || n==0)
            return n;
        for (int i=2; i<=n; i++){
            gt*=i;
        }
        return gt;
    }
    public long TinhDeQuy(long n){
        if (n > 0) {
            return n * TinhDeQuy(n - 1);
        } else {
            return 1;
        }
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
