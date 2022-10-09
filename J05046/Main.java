package J05046;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LoHang.initMap();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String tenHang = sc.nextLine();
            int soLuong = sc.nextInt();
            int donGia = sc.nextInt();
            LoHang lh = new LoHang(tenHang, soLuong, donGia);
            System.out.println(lh);
        }
    }
}
