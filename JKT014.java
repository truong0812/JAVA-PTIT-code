import java.util.*;

public class JKT014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int n = in.nextInt();
            int a[] = new int[n];
            Stack <Integer> kq = new Stack<>();
            for(int i=0;i < n;i++)
            {
                a[i] = in.nextInt();
                while(!kq.isEmpty() &&  a[kq.peek()] <= a[i]) kq.pop();
                if(kq.isEmpty()) System.out.print(i+1 + " ");
                else System.out.print(i - kq.peek() + " ");
                kq.add(i);
            }
            System.out.println();
        }
        in.close();
    }    
}
