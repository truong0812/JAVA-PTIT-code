import java.math.BigInteger;
import java.util.*;

public class J03066 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        while(true)
        {
            int t = Integer.parseInt(in.next());
            if(t == 0) break;
            BigInteger maxx = new BigInteger(in.next());
            BigInteger minn = new BigInteger(maxx.toString());
            while(t-- > 1)
            {
                BigInteger a = new BigInteger(in.next());
                if(a.equals(BigInteger.ZERO)) break;
                maxx = maxx.max(a);
                minn = minn.min(a);
            }
            if(maxx.equals(minn)) System.out.println("BANG NHAU");
            else System.out.println(minn + " " + maxx);
        }
    } 
}