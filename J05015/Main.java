package J05015;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Racer> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Racer(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(kq);
        for(Racer i:kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
