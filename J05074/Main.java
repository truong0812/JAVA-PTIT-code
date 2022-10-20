package J05074;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = Integer.parseInt(in.nextLine());
        ArrayList <SinhVien> kq = new ArrayList<>();
        for(int i=0;i < n;i++)
        {
            kq.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        for(int i=0;i < n;i++)
        {
            String[] x = in.nextLine().split("\\s+");
            for(int j=0;i < n;j++)
            {
                if(kq.get(j).getma().equals(x[0])) 
                {
                    kq.get(j).diemcc(x[1]);
                    break;
                }
            }
        }
        for(SinhVien i:kq)
        {
            System.out.println(i);
        }
    }
}
