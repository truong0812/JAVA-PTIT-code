package J05007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <NhanVien> kq = new ArrayList<>();
        while(t-- > 0)
        {
            NhanVien nv = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            kq.add(nv);
        }
        Collections.sort(kq);
        for(NhanVien i:kq)
        {
            System.out.println(i);
        }
    }
}
