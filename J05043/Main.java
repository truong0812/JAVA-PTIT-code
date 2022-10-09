package J05043;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <NhanVien> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int luongCoBan = sc.nextInt();
            int soNgayCong = sc.nextInt();
            list.add(new NhanVien(hoTen, chucVu, luongCoBan, soNgayCong));
        }
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
