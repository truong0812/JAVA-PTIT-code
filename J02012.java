import java.util.Scanner;

public class J02012 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int  n = Integer.parseInt(in.next());
        int[] a = new int[n];
        for(int i = 0 ;i < n;i++) a[i] = in.nextInt();
        for(int i = 0; i< n;i++)
        {
            Boolean ok = true;
            for(int j = 0 ;j < i ;j++)
            {
                if(a[i] < a[j])
                {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
            System.out.print("Buoc " + Integer.toString(i) +": ");
            for(int j =0;j <= i;j++)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
