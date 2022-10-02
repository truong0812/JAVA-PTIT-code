package J07053;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <ThiSinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        for(ThiSinh x : kq){
            System.out.println(x);
        }
    } 
}
