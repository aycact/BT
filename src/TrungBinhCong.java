public class TrungBinhCong {
    private int n;
    public float Tinh(){
        int t=0, s=0;
        while (n>0){
            t+=n%10;
            s++;
            n/=10;
        }
        for (int i=0; i<s; i++){
            t+=n%10;
            n/=10;
        }
        return (float)t/s;
    }
    public float TinhDeQuy(int n){
        if (n==0)
            return 0;
        return (10*TinhDeQuy(n/10)+n%10)/(n+1);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
