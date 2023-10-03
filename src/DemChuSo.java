public class DemChuSo {
    private int n;
    public int Dem(){
        int dem=0;
        int m=n;
        while(m>0){
            m/=10;
            dem++;
        }
        return dem;
    }
    public int DemDeQuy(int n){
        int m=n;
        if (m>10){
            return 1;
        }
        return 1+DemDeQuy(m/10);
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
