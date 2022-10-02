import java.util.*;
public class J02007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer t = Integer.parseInt(in.next());
        for(int i = 1;i <= t ; i++)
        {
            Integer n = Integer.parseInt(in.next());
            int[] a = new int[n + 5];
            int[] b = new int[n + 5];
            for(int j = 0;j < n;j++)
            {
                a[j] = in.nextInt();
                b[j] = -1;
            }
            for(int j = 0 ;j < n;j++)
            {
                if(b[j]  == -1)
                {
                    int cnt = 1;
                    for(int k = j+1;k < n;k++)
                    {
                        if(a[j] == a[k])
                        {
                            cnt ++;
                            b[k] = 0;
                        }
                    }
                    b[j] = cnt;
                }
            }
            System.out.println("Test " + i +":");
            for(int j = 0; j < n;j++)
            {
                if(b[j] != 0) System.out.println(a[j] +" xuat hien " + b[j] + " lan");
            }
        }
    }
}
