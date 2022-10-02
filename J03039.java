import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0 )
        {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            if(a.mod(b) == BigInteger.ZERO || b.mod(a) == BigInteger.ZERO) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
