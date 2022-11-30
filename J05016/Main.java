package J05016;

import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Khachhang> kq = new ArrayList<>();
        for(int i = 1;i <= t;i++)
        {
            kq.add(new Khachhang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine())));
        }
        Collections.sort(kq);
        for(Khachhang i:kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
