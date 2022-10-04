package J05023;

import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){        
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        while(q-->0){
            String khoa = sc.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",khoa);
            for(SinhVien tmp : ds)
                if(tmp.getkhoa().equals(khoa))
                    System.out.println(tmp);
        }
    }
}
