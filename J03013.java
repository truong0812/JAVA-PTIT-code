import java.math.BigInteger;
import java.util.*;
public class J03013 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0)
        {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            BigInteger c = a.subtract(b).abs();
            int dem=0;
            if (a.compareTo(b) == 1)
            {
                dem = a.toString().length() - c.toString().length();
            }
            else
            {
                dem = b.toString().length() - c.toString().length();
            }
            for (int i = 0; i < dem; i++) System.out.print("0");
            System.out.println(c);
            
        }
    }
}
