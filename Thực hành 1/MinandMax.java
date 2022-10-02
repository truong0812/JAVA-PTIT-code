import java.math.BigInteger;
import java.util.*;
public class MinandMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int n = Integer.parseInt(in.next());
            if(n == 0 ) break;
            ArrayList <BigInteger> a = new ArrayList<>();
            BigInteger x = new BigInteger(in.next());
            BigInteger maxx = new BigInteger(x.toString());
            BigInteger minn = new BigInteger(x.toString());
            for(int i = 1 ;i < n;i++)
            {
                x = new BigInteger(in.next());
                maxx = maxx.max(x);
                minn = minn.min(x);
            }
            if(maxx.equals(minn)) System.out.println("BANG NHAU");
            else System.out.println(minn + " " + maxx);
        }
    }
}
