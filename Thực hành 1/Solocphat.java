import java.util.*;
public class Solocphat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            String s = in.next();
            if(s.length() < 2) System.out.println("NO");
            else{
                if(s.charAt(s.length()-2) == '8' && s.charAt(s.length() - 1 ) == '6') System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
