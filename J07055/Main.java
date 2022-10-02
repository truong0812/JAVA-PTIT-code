package J07055;

import java.util.*;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Thisinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Thisinh(in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));

        }
        
        Collections.sort(kq);
        for(Thisinh x : kq){
            System.out.println(x);
        }
    }
}
