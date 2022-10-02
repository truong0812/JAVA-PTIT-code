import java.util.*;
public class Dayconlaplaidainhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.next());
            int maxx = 0;
            String s = in.next();
            for(int i = 0 ;i < n;i++)
            {
                int dem = 0;
                for(int j = i+1;j < n;j++)
                {
                    if(s.charAt(i) == s.charAt(j)) dem++;
                }
                maxx = Math.max(maxx, dem);
            }
            System.out.println(maxx);
        }
    }
}
