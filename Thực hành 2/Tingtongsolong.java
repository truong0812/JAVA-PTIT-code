import java.io.*;
import java.util.*;
public class Tingtongsolong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long s = 0;
        while(in.hasNext())
        {
            long x;
            try
            {
                x = Long.parseLong(in.next());
            }
            catch( Exception NumberFormatException )
            {
                continue;
            }
            if(x > Integer.MAX_VALUE) s += x;
        }
        System.out.println(s);
    }
}
