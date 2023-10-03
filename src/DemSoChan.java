public class DemSoChan {
    private int n;
    public int Dem(){
        int dem=0;
        int m=n;
        while(m>0){
            if (m%2==0)
                dem++;
            m/=10;
        }
        return dem;
    }
    public int DemDeQuy(int n){
        if (n==0)
            return 0;
        if (n%2==0)
            return 1+DemDeQuy(n/10);
        else return DemDeQuy(n/10);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
