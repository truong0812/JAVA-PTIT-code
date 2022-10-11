package J05058;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <ThiSinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            ThiSinh x = new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            kq.add(x);
        }
        Collections.sort(kq);
        for(ThiSinh x:kq)
        {
            System.out.println(x);
        }
        in.close();
    }
}
