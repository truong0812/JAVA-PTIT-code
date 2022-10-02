import java.util.*;
public class Tonggiaithua {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1,x = 1;
        for(int i = 2;i <= n;i++)
        {
            x *= i;
            s += x;
        }
        System.out.println(s);
    }
}
