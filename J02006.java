import java.util.*;
public class J02006 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        int[] a = new int[n+m];
        for(int i = 0 ;i < n+m ;i++) a[i] = Integer.parseInt(in.next());
        Arrays.sort(a);
        System.out.print(a[0] + " ");
        for(int i = 1;i < n+m;i++)
        {
            if(a[i-1] != a[i]) System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
