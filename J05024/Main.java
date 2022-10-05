package J05024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        while(n-- > 0){
            String maSV = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(maSV, hoTen, lop, email));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String nganhCanTim = sc.nextLine();
            nganhCanTim = nganhCanTim.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganhCanTim + ":");
            for(SinhVien x : list){
                if(x.nganhHoc().equals(nganhCanTim)){
                    System.out.println(x);
                }
            }
        }
    }
}
