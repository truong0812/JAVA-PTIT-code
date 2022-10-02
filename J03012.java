import java.math.BigInteger;
import java.util.*;
public class J03012 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
}
