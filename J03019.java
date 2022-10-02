import java.util.*;

public class J03019 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = sc.next();
        StringBuilder s = new StringBuilder();
        Character x = str.charAt(str.length() - 1);
        s.append(x);
        for(int i = str.length() - 2;i >= 0;i--)
        {
            if(str.charAt(i) >= x)
            {
                x = str.charAt(i);
                s.append(x);
            }
        }
        System.out.println(s.reverse());
    }
}