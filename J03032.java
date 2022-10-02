import java.util.*;
public class J03032 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String s = in.nextLine();
            StringTokenizer s1 = new StringTokenizer(s);
            while(s1.hasMoreTokens())
            {
                StringBuilder s2 = new StringBuilder(s1.nextToken());
                System.out.print(s2.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
