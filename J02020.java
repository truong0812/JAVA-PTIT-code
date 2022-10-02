import java.util.Scanner;
import java.util.Vector;

public class J02020 {
    static Vector <Integer>  kq = new Vector<>();
    static int dem,n,k;

    public static void in()
    {
        dem++;
        for(int i = 0 ; i < k;i++)
        {
            System.out.print(kq.get(i) + " ");
        }
        System.out.println();
    }

    public static void sinh(int s, int x)
    {
        for(int i = x;i <= n-k+s;i++ )
        {
            kq.add(i);
            if(s == k) in();
            else sinh(s+1,i+1);
            kq.remove(kq.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.next());
        k = Integer.parseInt(in.next());
        dem = 0;
        sinh(1,1);
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
