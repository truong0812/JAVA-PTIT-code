package J05024;

import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){        
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt(); sc.nextLine();
        while(q-->0){
            String industry = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",industry.toUpperCase());
            for(SinhVien tmp : ds)
                if(tmp.getIndustry().equals(industry))
                    System.out.println(tmp);
        }
    }
}
