import java.util.*;
import java.math.*;

public class Tinhluythua {
    public static int modPrimePow(long a, long b, int p)
    {
        long ret = 1;
        a %= p;
        b %= p - 1;
        while (b > 0) 
        {
            if (b % 2 > 0)  
                ret = ret * a % p;
            a = a * a % p;  
            b /= 2;
        }
        return (int) ret;
    }
    public static int  m = 1000000007;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a = sc.nextLong() , b = sc.nextLong();
            if(a == 0 && b == 0) break;
            else System.out.println(modPrimePow(a, b, m));
        }
    }
}
