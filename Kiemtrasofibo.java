import java.util.*;

public class Kiemtrasofibo
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
            long x = sc.nextLong();
            String res = "NO";
            for(int j=0; j <= 92;j++)
            {
                if(a[j] >= x)
                {
                    if(a[j] == x)res = "YES";
                    break;
                }
            }
            System.out.println(res);
        }
    }
    
}