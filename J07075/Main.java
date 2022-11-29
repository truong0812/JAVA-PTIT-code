package J07075;

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
            String ma = in.nextLine().trim();
            String ten = in.nextLine().trim();
            String sotin = in.nextLine().trim();
            Monhoc x = new Monhoc(ten, sotin);
            sub.put(ma, x);
        } 
        in = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(in.nextLine());
        ArrayList <LichGD> kq = new ArrayList<>();
        for(int i =1;i <= n;i++)
        {
            String ma = in.nextLine();
            Monhoc subject = sub.get(ma);
            kq.add(new LichGD(i, subject, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        String q = in.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + q + ":");
        for(LichGD i:kq)
        {
            if(i.gettengv().equals(q))
            {
                System.out.println(i);
            }
        }
        in.close();
    }
}
