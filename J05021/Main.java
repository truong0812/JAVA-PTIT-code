package J05021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <SinhVien> kq = new ArrayList<>();
        while(in.hasNext())
        {
            kq.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for(SinhVien i:kq)
        {
            System.out.println(i);
        }
    }
}
