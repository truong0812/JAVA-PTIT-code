package J07073;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MonHoc> kq = new ArrayList<>();
        while(t-- > 0)
        {
            MonHoc x = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            if(!x.getth().equals("Truc tiep")) kq.add(x);
        }
        Collections.sort(kq);
        for(MonHoc i:kq)
        {
            System.out.println(i);
        }
    }
}
