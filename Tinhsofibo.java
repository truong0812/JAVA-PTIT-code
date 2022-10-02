import java.util.*;

public class Tinhsofibo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] a= new long[100];
        a[1] = a[2] = 1;
        for(int i = 3;i <= 92; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        for(int i = 0;i < t;i++)
        {
            int x = sc.nextInt();
            System.out.println(a[x]);
        }
    }
    
}