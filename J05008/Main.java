package J05008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int n = in.nextInt();
            Dagiac x = new Dagiac(n, in);
            System.out.println(x.dtdagiac());
        }
    }
}
