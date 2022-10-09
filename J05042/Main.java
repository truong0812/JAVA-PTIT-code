package J05042;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new SinhVien(in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for(SinhVien i:kq)
        {
            System.out.println(i);
        }
    }

}

