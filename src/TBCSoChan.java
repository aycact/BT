public class TBCSoChan {
    private int n;
    public float Tinh(){
        int t=0, s=0;
        while (n>0){
            if (n%2==0)
                t+=n%10;
            s++;
            n/=10;
        }
        return (float)t/s;
    }
    public float TinhDeQuy(int n){
        if (n==0)
            return 0;
        if (n%10==0)
            return (n%10+TinhDeQuy(n/10))/2;
        return TinhDeQuy(n/10);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
