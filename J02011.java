import java.util.Scanner;

public class J02011 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int  n = Integer.parseInt(in.next());
        int[] a = new int[n];
        for(int i = 0 ;i < n;i++) a[i] = in.nextInt();
        for(int i = 0; i< n-1;i++)
        {
            int min = a[i];
            int vtri = i;
            for(int j = i+1; j < n;j++)
            {
                
                if(min > a[j])
                {
                    min = a[j];
                    vtri = j;
                }
            }
            int k = a[i];
            a[i] = a[vtri];
            a[vtri] = k;
            System.out.print("Buoc " + Integer.toString(i+1) +": ");
            for(int j =0;j < n;j++)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
