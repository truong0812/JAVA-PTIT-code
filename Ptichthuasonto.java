import java.util.*;

public class Ptichthuasonto {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<= t;i++)
        {
            int x = sc.nextInt();
            System.out.print("Test "+i+": ");
            ptich(x);
        }
    }

    public static void ptich(int x)
    {
        if(x <= 2) {
            System.out.println(x + "(1)");
            return;
        }
        int k = (int)Math.sqrt(x) + 1;
        for(int i = 2;i <= k; i ++)
        {
            int dem = 0;
            while(x % i == 0)
            {
                x/=i;
                dem ++;
            }
            if(dem!=0) System.out.print(i + "(" + dem + ")" +" ");
        }
        if(x != 1) System.out.println(x + "(1)");
        System.out.println();
    }
}
