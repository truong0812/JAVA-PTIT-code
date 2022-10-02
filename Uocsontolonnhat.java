import java.util.*;
import java.math.*;

public class Uocsontolonnhat {

    
    public static boolean nto(long x)
    {
        if(x < 2) return false;
        if(x == 2 || x == 3) return true;
        for(int i=2 ; i <= Math.sqrt(x) ;i++ )
        {
            if(x % i == 0) return false;
        }
        return true;
    }

    public static long uoc(long x)
    {
        long k = 0;
        for(int i =1;i <= Math.sqrt(x);i++)
        {
            if(x % i == 0)
            {
                if(nto(x/i)) return x/i;
                if(nto(i)) k = i;
            }
        }
        return k;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i < t;i++)
        {
            long x = sc.nextLong();
            System.out.println(uoc(x));
        }
    }
}
