import java.util.Scanner;

public class Main {
    public static void Bai1(){
        System.out.println("Nhap n: ");
        GiaiThua gt = new GiaiThua();
        Scanner sc = new Scanner(System.in);
        gt.setn(sc.nextInt());
        System.out.println("Giai thua cua " + gt.getn() +" la "+gt.Tinh());
        sc.close();  
    }
    public static void Bai2(){
        System.out.println("Nhap n: ");
        Tong t = new Tong();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Tong cac gia tri den "+t.getn()+" : " + t.Tinh());
        sc.close();
    }
    public static void Bai3() {
        System.out.println("Nhap n: ");
        Tong3 t = new Tong3();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Ket qua: " + t.Tinh());
        sc.close();
    }
    public static void Bai4() {
        System.out.println("Nhap n: ");
        Tong4 t = new Tong4();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Ket qua: " + t.Tinh());
        sc.close();
    }
    public static void Bai5() {
        System.out.println("Nhap n: ");
        Fibonacci f = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        f.setn(sc.nextInt());
        System.out.println("Ket qua: " + f.Tinh());
        sc.close();
    }
    public static void Bai6() {
        System.out.println("Nhap n: ");
        Mu gt = new Mu();
        Scanner sc = new Scanner(System.in);
        gt.setn(sc.nextInt());
        System.out.println("Nhap m: ");
        gt.setm(sc.nextInt());
        System.out.println("Ket qua: " + gt.Tinh());
        sc.close();
    }
    public static void Bai7() {
        System.out.println("Nhap n: ");
        DemChuSo d = new DemChuSo();
        Scanner sc = new Scanner(System.in);
        d.setn(sc.nextInt());
        System.out.println("Ket qua: " + d.Dem());
        sc.close();
    }
    public static void Bai8() {
        System.out.println("Nhap n: ");
        TrungBinhCong t = new TrungBinhCong();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Ket qua: " + t.Tinh());
        sc.close();
    }
    public static void Bai9() {
        System.out.println("Nhap n: ");
        DemSoLe d = new DemSoLe();
        Scanner sc = new Scanner(System.in);
        d.setn(sc.nextInt());
        System.out.println("Ket qua: " + d.Dem());
        sc.close();
    }
    public static void Bai10() {
        System.out.println("Nhap n: ");
        DemSoChan d = new DemSoChan();
        Scanner sc = new Scanner(System.in);
        d.setn(sc.nextInt());
        System.out.println("Ket qua: " + d.Dem());
        sc.close();
    }
    public static void Bai11() {
        System.out.println("Nhap n: ");
        TBCSoLe t = new TBCSoLe();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Ket qua: " + t.Tinh());
        sc.close();
    }
    public static void Bai12() {
        System.out.println("Nhap n: ");
        TBCSoChan t = new TBCSoChan();
        Scanner sc = new Scanner(System.in);
        t.setn(sc.nextInt());
        System.out.println("Ket qua: " + t.Tinh());
        sc.close();
    }
    public static void Chon(){
        System.out.println("Chọn bài: ");
        System.out.println("1. Nhập 1 số nguyên n. Tính n!.");
        System.out.println("2. Nhập 1 số nguyên n. Tính tổng các giá trị đến n.");
        System.out.println("3. Nhập 1 số nguyên n. Tính tổng theo S(n) = 1+1/2 + 1/3 + ... + 1/n");
        System.out.println("4. Nhập 1 số nguyên n. Tính tổng theo S(n) = : 1*2 + 2*3+ 3*4 + 4*5 +.....+ n(n+1)");
        System.out.println("5. Nhập 1 số nguyên n. Tính các số Fibonacci <= n.");
        System.out.println("6. Nhập 2 số nguyên n, m. Tính n mũ n.");
        System.out.println("7. Nhập 1 số nguyên n. Đếm số lượng chữ số của n.");
        System.out.println("8. Nhập 1 số nguyên n. Tính trung bình cộng các chữ số của n.");
        System.out.println("9. Nhập 1 số nguyên n. Đếm số lượng chữ số lẻ của n.");
        System.out.println("10. Nhập 1 số nguyên n. Đếm số lượng chữ số chẵn của n.");
        System.out.println("11. Nhập 1 số nguyên n. Tính trung bình cộng các chữ số lẻ của n.");
        System.out.println("12. Nhập 1 số nguyên n. Tính trung bình cộng các chữ số chẵn của n.");
        Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()){
                case 1:{
                    Bai1();
                    break;
                }
                case 2:{
                    Bai2();
                    break;
                }
                case 3:{
                    Bai3();
                    break;
                }
                case 4:{
                    Bai4();
                    break;
                }
                case 5:{
                    Bai5();
                    break;
                }
                case 6:{
                    Bai6();
                    break;
                }
                case 7:{
                    Bai7();
                    break;
                }
                case 8:{
                    Bai8();
                    break;
                }
                case 9:{
                    Bai9();
                    break;
                }
                case 10:{
                    Bai10();
                    break;
                }
                case 11:{
                    Bai11();
                    break;
                }
                case 12:{
                    Bai12();
                    break;
                }
                default:
                    System.exit(0);
            }
        sc.close();
    }
    public static void main(String[] args) {
        Chon();
    }
}