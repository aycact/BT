public class Mu {
    private int n, m;
    public int Tinh(){
        int t=1;
        if (m==0)
            return 1;
        else if (n==0)
                return 0;
        for (int i=1; i<=m; i++)
            t*=n;
        return t;
    }
    public int TinhDeQuy(int n, int m){
        if (n==1) {
            return n;
        } else {
            return TinhDeQuy(n, m-1)*n;
        }
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
    public void setm(int m){
        this.m=m;
    }
    public int getm(){
        return m;
    }
}
