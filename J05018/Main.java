package J05018;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <HocSinh> kq = new ArrayList<>();
        while(t-->0)
        {
            String hoTen = in.nextLine();
            BigDecimal[] d = new BigDecimal[10];
            for(int i = 0; i < 10; i++){
                d[i] = in.nextBigDecimal();
            }
            kq.add(new HocSinh(hoTen, d));
            in.nextLine();

        }
        Collections.sort(kq);
        for(HocSinh i:kq)
        {
            System.out.println(i);
        }
    }
}
