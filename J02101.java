import java.util.Scanner;

public class J02101 {
    static int[][] a = new int[100][100];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.next());
            for(int i = 0 ;i < n;i++)
            {
                for(int j = 0 ;j < n; j++)
                {
                    a[i][j] = Integer.parseInt(in.next());
                }
            }
            for(int i = 0 ;i < n ;i++)
            {
                if(i % 2 == 0)
                {
                    for(int j = 0 ;j < n;j++)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                }
                else
                {
                    for(int j = n-1; j >= 0;j--)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
