package J05028;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <DoanhNghiep> list = new ArrayList<>();
        while(n-- > 0){
            String maDoanhNghiep = sc.next();
            sc.nextLine();
            String tenDoanhNghiep = sc.nextLine();
            int soSinhVien = sc.nextInt();
            list.add(new DoanhNghiep(maDoanhNghiep, tenDoanhNghiep, soSinhVien));
        }
        Collections.sort(list);
        for(DoanhNghiep x : list){
            System.out.println(x);
        }
    }
}
