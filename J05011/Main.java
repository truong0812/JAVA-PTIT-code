package J05011;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <KhachHang> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new KhachHang(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for(KhachHang i:kq)
        {
            System.out.println(i);
        }
    }
}
