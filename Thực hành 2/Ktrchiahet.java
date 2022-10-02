import java.io.*;
import java.math.*;
import java.util.*;
public class Ktrchiahet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SONGUYEN.in"));
        BigInteger bay = new BigInteger("7");
        BigInteger muoiba = new BigInteger("13");
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0)
        {
            BigInteger n = new BigInteger(in.nextLine());
            boolean div7 = false, div13 = false;
            if(n.mod(bay) == BigInteger.ZERO) div7 = true;
            if(n.mod(muoiba) == BigInteger.ZERO) div13 = true;
            if(div13 && div7) System.out.println("Both");
            else if(div13) System.out.println("Div 13");
            else if(div7) System.out.println("Div 7");
            else System.out.println("None");
        }
    }
}
