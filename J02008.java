import java.math.BigInteger;
import java.util.*;
public class J02008 {
    static ArrayList <BigInteger> a = new ArrayList<>();
    public static void bsochung()
    {
        a.add(BigInteger.ZERO);      
        a.add(BigInteger.ONE);      
        a.add( new BigInteger("2"));  
        for(Integer i = 3 ; i < 100;i++)
        {
            BigInteger x = new BigInteger(i.toString());
            a.add(x.multiply(a.get(i -1 )).divide(x.gcd(a.get(i-1))));
        }    
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer t = Integer.parseInt(in.next());
        bsochung();
        while(t-- > 0 )
        {
            Integer n  = Integer.parseInt(in.next());
            System.out.println(a.get(n));
        }
    }
}
