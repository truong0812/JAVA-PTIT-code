import java.util.*;

public class J03018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            String x = in.next();
            if(x.length() <= 2)
            {
                if(Integer.parseInt(x) % 4 == 0) System.out.println("4");
                else System.out.println("0");
            }
            else
            {
                String s = x.substring(x.length()-2);
                if(Integer.parseInt(s) % 4 == 0) System.out.println("4");
                else System.out.println("0");
            }
        }
    }
}
