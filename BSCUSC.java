import java.util.*;
import java.math.*;
public class BSCUSC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 0 ;i < t;i++)
        {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println( (a*b)/gcd(a,b)  + " " +gcd(a,b));
        }

    }

    public static long gcd (long a,long b)
    {
        while(a*b != 0)
        {
            if(a > b)
            {
                a %=b;
            }
            else b %=a;
        }
        return a+b;
    }
}


