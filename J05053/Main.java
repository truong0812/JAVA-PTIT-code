package J05053;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <DonHang> list = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            String tenHang = sc.nextLine();
            String maHang = sc.next();
            int donGia = sc.nextInt();
            int soLuong = sc.nextInt();
            list.add(new DonHang(tenHang, maHang, donGia, soLuong));
        }
        Collections.sort(list);
        for(DonHang x : list){
            System.out.println(x);
        }
    }
}
