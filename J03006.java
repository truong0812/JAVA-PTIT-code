import java.util.*;
public class J03006 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            StringBuilder s = new StringBuilder(in.nextLine());
            if(s.equals(s.reverse()) && check(s.toString())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s)
    {
        for(int i=0 ; i<s.length(); i++)
        {
            if((int)s.charAt(i) % 2 != 0 ) return false;
        }
        return true;
    }
}
