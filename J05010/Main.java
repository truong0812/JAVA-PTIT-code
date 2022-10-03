package J05010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MatHang> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new MatHang(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));

        }
        Collections.sort(kq);
        for(MatHang i:kq)
        {
            System.out.println(i);
        }
    }
}
