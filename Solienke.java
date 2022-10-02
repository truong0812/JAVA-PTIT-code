import java.util.*;
public class Solienke {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++)
        {
            String s = sc.next();
            boolean check = true;
            for(int j =0;j < s.length() - 1;j++)
            {
                int x = s.charAt(j), y = s.charAt(j+1);
                if(Math.abs(x - y) != 1 ) 
                {
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
