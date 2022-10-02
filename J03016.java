import java.math.BigInteger;
import java.util.*;
public class J03016 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger m = BigInteger.ZERO;
        BigInteger k = new BigInteger("11");
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            BigInteger x = new BigInteger(sc.next());
            if(x.mod(k).equals(m)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
