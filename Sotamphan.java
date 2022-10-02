import java.util.*;
public class Sotamphan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++)
        {
            String s = sc.next();
            boolean check = true;
            for(int j = 0; j < s.length();j++)
            {
                if(s.charAt(j) != '1' && s.charAt(j) != '2' && s.charAt(j) != '0') check = false;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
