import java.util.*;


public class Taphopsonguyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        Set <Integer> a = new TreeSet<>();
        Set <Integer> b = new TreeSet<>();
        for(int i = 0 ;i < n;i ++)
        {
            Integer x = Integer.parseInt(in.next());
            a.add(x);
        }
        for(int i = 0 ;i < m;i ++)
        {
            Integer x = Integer.parseInt(in.next());
            b.add(x);
        }
        for(int x:a)
        {
            if(b.contains(x)) System.out.print(x + " ");
        }
        System.out.println();
        for(int x:a)
        {
            if(!b.contains(x)) System.out.print(x + " ");
        }
        System.out.println();
        for(int x:b)
        {
            if(!a.contains(x)) System.out.print(x + " ");
        }
    }
}
