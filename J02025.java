import java.util.*;
public class J02025 {
    static int n;
    static int[] a = new int[15];
    static ArrayList <Integer> kq = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static boolean nto(int s)
    {
        if(s < 2) return false;
        int i = 2;
        while(i*i <= s)
        {
            if(s % i == 0) return false;
            i++;
        }
        return true;
    }

    public static void check()
    {
        int s = 0;
        for(int i:kq) s+=i;
        if(nto(s))  
        {
            Collections.sort(kq, Collections.reverseOrder());
            for(int i:kq) System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void sinh(int k)
    {
        for(int i = 0 ; i <= 1;i++)
        {
            if(i == 1) kq.add(a[k]);
            if(k == 0) check();
            else sinh(k - 1);
            if(i == 1) kq.remove(kq.size() - 1); 
        }
    }
    public static void main(String[] args) {
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            n = Integer.parseInt(in.next());
            for(int i = 0;i < n;i++)
            {
                a[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(a, 0, n);
            sinh(n-1);
        }
    }
}
