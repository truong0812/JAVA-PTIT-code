import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int dem = 0;
        int slg1 = 0;
        int x;
        for(int i = 0;i < n;i++)
        {
            for(int j = 0 ;j < 3;j++)
            {
                x = Integer.parseInt(in.next());
                if(x == 1) slg1 ++;
            }
            if(slg1 >= 2) dem ++;
            slg1 = 0;
        }
        System.out.print(dem);
    }
}
