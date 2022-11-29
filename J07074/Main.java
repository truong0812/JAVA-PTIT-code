package J07074;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(in.nextLine());
        Map <String,Monhoc> sub = new HashMap<>();
        while(n-- > 0)
        {
            String ma = in.nextLine();
            String ten = in.nextLine();
            String sotin = in.nextLine();
            Monhoc x = new Monhoc(ma, ten, sotin);
            sub.put(ma, x);
        } 
        in = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(in.nextLine());
        ArrayList <LichGD> kq = new ArrayList<>();
        for(int i =1;i <= n;i++)
        {
            kq.add(new LichGD(i,in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        String q = in.nextLine();
        System.out.println("LICH GIANG DAY MON " + sub.get(q).getten() + ":");
        for(LichGD i:kq)
        {
            if(i.getma().equals(q))
            {
                System.out.println(i);
            }
        }
        in.close();
    }
}
