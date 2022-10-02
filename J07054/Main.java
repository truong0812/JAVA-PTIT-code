package J07054;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <ThiSinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new ThiSinh(in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));

        }
        Collections.sort(kq);
        int rank = 1;
        int cnt = 1;
        System.out.println(kq.get(0).toString() + "1");
        for(int i = 1;i < kq.size();i++)
        {
            System.out.print(kq.get(i));
            if(kq.get(i-1).diem == kq.get(i).diem)
            {
                System.out.println(rank);
                cnt++;
            }
            else
            {
                rank += cnt;
                cnt = 1;
                System.out.println(rank);
            }
        }
    }
}
