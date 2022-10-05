package J05027;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <GiangVien> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            list.add(new GiangVien(hoTen, boMon));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String tuKhoa = sc.nextLine();
            String key = tuKhoa.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            for(GiangVien x : list){
                if(x.getHoTen().toLowerCase().contains(key)){
                    System.out.println(x);
                }
            }
        }
    }
}
