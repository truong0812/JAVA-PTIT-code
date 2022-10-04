package J05022;

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
            String clas = sc.next();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n",clas);
            for(SinhVien tmp : ds)
                if(tmp.getclas().equals(clas))
                    System.out.println(tmp);
        }
    }
}
