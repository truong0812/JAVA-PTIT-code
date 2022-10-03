package J07084;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for(SinhVien i:kq)
        {
            System.out.println(i);
        }
    }
}
