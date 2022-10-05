package J05026;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <GiangVien> list = new ArrayList<>();
        while(n-- > 0){
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            list.add(new GiangVien(hoTen, boMon));
        }
        n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            String boMonCanTim = sc.nextLine();
            boMonCanTim = boMonCanTim.toUpperCase();
            String[] arr = boMonCanTim.split("\\s+");
            String tmp = "";
            for(String x : arr){
                tmp += x.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for(GiangVien i:list)
            {
                if(i.getbomon().equals(tmp)) System.out.println(i);
            }
        }    
        
    }
}
