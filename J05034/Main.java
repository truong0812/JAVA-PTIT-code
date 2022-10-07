package J05034;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String s = in.nextLine();
            for(SinhVien i:kq)
            {
                if(i.getdoanhnghiep().equals(s)) System.out.println(i);
            }
        }
    }
}
