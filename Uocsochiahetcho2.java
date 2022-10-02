import java.util.*;
public class Uocsochiahetcho2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i++)
        {
            int dem= 0;
            int x = sc.nextInt();
            for(int j = 2; j <= Math.sqrt(x); j++)
            {
                if(x % j == 0)
                {
                    if(j % 2 == 0) dem++;
                    if(j != x/j && (x/j) % 2 == 0) dem++;
                }
            }
            if(x % 2 == 0) dem++;
            System.out.println(dem);
        }
    }
}
