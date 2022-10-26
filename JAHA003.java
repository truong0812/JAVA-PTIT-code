import java.math.BigInteger;
import java.util.Scanner;

public class JAHA003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger muoimot = new BigInteger("11");
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            BigInteger x = new BigInteger(in.nextLine());
            if(x.mod(muoimot).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
    