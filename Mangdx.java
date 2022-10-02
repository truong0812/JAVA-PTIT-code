import java.util.*;
public class Mangdx {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n+5];
            for(int j = 0; j < n;j++)
            {
                a[j] = sc.nextInt();
            }
            boolean check = true;
            for(int j = 0 ;j < n/2;j++)
            {
                if(a[j] != a[n-1-j]) check = false;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
