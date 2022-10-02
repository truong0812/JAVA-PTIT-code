package J07050;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MatHang> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new MatHang(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(kq);
        for(MatHang i : kq)
        {
            System.out.println(i);
        }
    }
    
}

