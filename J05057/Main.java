package J05057;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            ThiSinh x = new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            System.out.println(x);
        }
        in.close();
    }
}
