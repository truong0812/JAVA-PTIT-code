import java.util.*;
public class J03031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String s = in.nextLine();
            int k = Integer.parseInt(in.nextLine());
            HashSet <Character> kq = new HashSet<>();
            for(int i = 0;i < s.length();i++)
            {
                kq.add(Character.toLowerCase(s.charAt(i)));
            }
            if(26 - kq.size() <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
