public class Fibonacci {
    private int n;
    public int Tinh(){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public int TinhDeQuy(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return TinhDeQuy(n - 1) + TinhDeQuy(n - 2);
        }
    }
    public void setn(int n){
        this.n=n;
    }
    public int getn(){
        return n;
    }
}
