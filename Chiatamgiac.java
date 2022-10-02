import java.util.*;
import java.math.*;

public class Chiatamgiac {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i < t;i++)
        {
            int n = sc.nextInt(), h = sc.nextInt();
            doit(n,h);
        }
    }

    public static void doit(int n,int h)
    {
        for (int i = 1;i < n;i++)
        {
            System.out.printf("%.6f ",Math.sqrt((double)i/n)* h);
        }
        System.out.println();
    }
}
