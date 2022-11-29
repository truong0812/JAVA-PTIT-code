package J05012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Bill> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Bill(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine())));
        }
        Collections.sort(kq);
        for(Bill i:kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
