package J05076;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> matHangs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            MatHang matHang = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            matHangs.add(matHang);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<ThongKe> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            ThongKe thongKe = new ThongKe(sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), matHangs);
            list.add(thongKe);
        }
        for(ThongKe thongKe : list) {
            System.out.println(thongKe);
        }
        sc.close();
    }
}
