package J05029;

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
        int q = sc.nextInt();
        while(q-- > 0){
            int L = sc.nextInt(), R = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + L + " DEN " + R + " SINH VIEN:");
            for(DoanhNghiep x : list){
                if(x.getSoSinhVien() >= L && x.getSoSinhVien() <= R){
                    System.out.println(x);
                }
                else if(x.getSoSinhVien() < L)
                    break;
            }
        }
    }
}
