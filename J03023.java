import java.util.*;
public class J03023 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            String s = in.next();
            int[] kq = new int[s.length()];
            for(int i = 0; i < s.length() ;i++)
            {
            if(s.charAt(i) == 'I')
                kq[i] = 1;
            else if(s.charAt(i) == 'V')
                kq[i] = 5;
            else if(s.charAt(i) == 'X')
                kq[i] = 10;
            else if(s.charAt(i) == 'L')
                kq[i] = 50;
            else if(s.charAt(i) == 'C')
                kq[i] = 100;
            else if(s.charAt(i) == 'D')
                kq[i] = 500;
            else if(s.charAt(i) == 'M')
                kq[i] = 1000;
            }
            long k = kq[s.length() - 1];
            for(int i = s.length()-1; i > 0; i--)
            {
            if(kq[i] > kq[i-1])
                k = k - kq[i-1];
            else if(kq[i] == kq[i-1] || kq[i] < kq[i-1])
                k = k + kq[i-1];
            }
            System.out.println(k);
        }
    }
}

