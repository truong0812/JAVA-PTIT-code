package J07037;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <DoanhNghiep> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for (DoanhNghiep i : kq)
        {
            System.out.println(i);
        }
    }
}
