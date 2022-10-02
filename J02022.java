import java.util.*;


public class J02022 {
    static Vector <Integer> kq = new Vector<>();
    static boolean[] x = new boolean[10];
    static int n;

    public static void in()
    {
        for(int i = 0 ;i < n ;i++)
        {
            System.out.print(kq.get(i));
        }
        System.out.println();
    }

    public static void check()
    {
        boolean test = true;
        for(int i = 0 ;i < n - 1;i++)
        {
            if(Math.abs(kq.get(i) - kq.get(i+1)) == 1) 
            {
                test = false;
                break;
            }
        }
        if(test) in();
    }
    
    public static void sinh(int s)
    {
        for(int i = 1;i <= n;i++)
        {
            if(x[i])
            {
                kq.add(i);
                x[i] = false;
                if(s == n) check();
                else sinh(s+1);
                kq.remove(kq.size() - 1);
                x[i] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            n = Integer.parseInt(in.next());
            Arrays.fill(x,true);
            kq.clear();
            sinh(1);
            System.out.println();
        }
    }
}
