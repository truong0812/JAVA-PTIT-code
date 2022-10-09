package J05041;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <NhanVien> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String tenNV = sc.nextLine();
            int luongNgay = sc.nextInt();
            int soNgayCong = sc.nextInt();
            String chucVu = sc.next();
            list.add(new NhanVien(tenNV, luongNgay, soNgayCong, chucVu));
        
        }
        Collections.sort(list);
        for(NhanVien x : list){
            System.out.println(x);
        }
    }
}
