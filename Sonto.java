import java.util.*;
import java.math.*;


public class Sonto {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i < t;i++)
        {
            long x = sc.nextLong();
            if(check(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(long n)
    {
        if (n < 2) return false;
        for(int i = 2 ;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    
}
