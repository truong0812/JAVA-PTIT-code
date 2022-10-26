import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int n = in.nextInt();
            long x[] = new long[n];
            Stack <Long> a = new Stack<>();
            Stack <Long> kq = new Stack<>();
            for(int i = 0;i < n;i++)
            {
                x[i] = in.nextInt();
            }
            for(int i = n-1;i >= 0;i--)
            {
                while(!a.isEmpty() && a.peek() <= x[i]) a.pop();
                if(a.isEmpty()) kq.add(-1L);
                else kq.add(a.peek());
                a.add(x[i]);
            }
            while(!kq.isEmpty()) 
            {
                System.out.print(kq.peek() + " ");
                kq.pop();
            }
            System.out.println();
        }
    }
}
