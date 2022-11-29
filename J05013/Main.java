package J05013;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Nhanvien> kq = new ArrayList<>();
        for(int i=1;i <= t;i++)
        {
            kq.add(new Nhanvien(i, in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(kq);
        for(Nhanvien i:kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
