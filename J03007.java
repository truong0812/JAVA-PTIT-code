import java.util.*;
public class J03007 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            String s = in.next();
            if(s.charAt(0) == '8' && s.charAt(s.length() - 1) == '8' && check(s))
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s)
    {
        int sum = 0;
        for(int i =0; i < s.length();i++)
        {
            int x = Integer.parseInt(String.valueOf(s.charAt(i)));

            sum += x;

        }
        
        if(sum % 10 == 0) return true;
        else return false;
    }
}
