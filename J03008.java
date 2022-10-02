import java.util.*;
public class J03008 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t  = Integer.parseInt(in.next());
        while(t -- > 0)
        {
            StringBuilder s1 = new StringBuilder(in.next());
            StringBuilder s2 = new StringBuilder(s1.toString());
            s1 = s1.reverse();
            if(s1.toString().equals(s2.toString()) && check(s1.toString()))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    public static boolean check(String s)
    {
        for(int i = 0 ;i < s.length() ;i++)
        {
            int x = Integer.parseInt(String.valueOf(s.charAt(i)));
            if( x != 2 && x != 3 && x!= 5 && x!= 7) return false;
        }
        return true;
    }
}
