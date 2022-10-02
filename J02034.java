import java.util.*;
public class J02034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int[] a = new int[n];
        for(int i = 0 ;i < n ;i++)
        {
            a[i] = Integer.parseInt(in.next());
        }
        if(n == a[n-1]) System.out.println("Excellent!");
        else
        {
            int i = 0 ;
            int j = 1;
            while(i < n && j <= a[n-1])
            {
                if(a[i] ==j) 
                {
                    i++;
                    j++;
                }
                else
                {
                    if(a[i] > j)
                    {
                        System.out.println(j);
                        j++;
                    }
                    else i++;
                }
            }
        }
    }
}
