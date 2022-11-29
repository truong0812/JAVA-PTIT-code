import java.util.*;

public class J03017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            String s = in.next();
            ArrayList <Character> kq = new ArrayList<>();
            ArrayList <Integer> idx = new ArrayList<>();
            idx.add(-1);
            int res = 0;
            for(int i = 0;i < s.length();i++)
            {
                idx.add(i);
                kq.add(s.charAt(i));

                while(kq.size() >= 3  && kq.get(kq.size() - 1) == '0' && kq.get(kq.size() - 2) == '0' && kq.get(kq.size() - 3) == '1')
                {
                    kq.remove(kq.size() - 1);
                    kq.remove(kq.size() - 1);
                    kq.remove(kq.size() - 1);
                    idx.remove(idx.size() - 1);
                    idx.remove(idx.size() - 1);
                    idx.remove(idx.size() - 1);
        
                }
                res = Math.max(res,i - idx.get(idx.size() - 1));
            }
            System.out.println(res);
        }
    }
}
