package J07033;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> kq = new ArrayList<>();
        while(t-- > 0)
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
