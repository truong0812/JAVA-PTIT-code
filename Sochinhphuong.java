import java.util.*;
import java.math.*;

public class Sochinhphuong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i < t;i++)
        {
            int x = sc.nextInt();
            if((int) Math.sqrt(x) == Math.sqrt(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
