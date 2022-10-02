import java.util.*;
public class Sokolienke {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++)
        {
            String s = sc.next();
            boolean check = true;
            int sum = 0;
            for(int j =0;j < s.length() - 1;j++)
            {
                
                int x = s.charAt(j), y = s.charAt(j+1);
                sum +=(x -48);
                if(Math.abs(x - y) != 2 ) 
                {
                    check = false;
                    break;
                }
                

            }
            int x = s.charAt(s.length() - 1); sum+=(x-48);
            if(sum % 10 == 0 && check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
