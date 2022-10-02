package J07052;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Thisinh> kq = new ArrayList<>();
        while(t--  >0 )
        {
            kq.add(new Thisinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));

        }
        int chitieu = Integer.parseInt(in.nextLine());
        Collections.sort(kq);
        double diemchuan = kq.get(chitieu - 1).gettongdiem();
        System.out.println(diemchuan);
        for (Thisinh i : kq)
        {
            System.out.print(i);
            if(i.gettongdiem() >= diemchuan ) System.out .println(" TRUNG TUYEN" );
            else System.out.println(" TRUOT");
        }
    }
}
