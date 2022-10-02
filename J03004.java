import java.util.*;
public class J03004 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < t; i++)
        {
            String s = sc.nextLine();
            StringTokenizer token = new StringTokenizer(s);
            StringBuilder kq = new StringBuilder("");
            while(token.hasMoreTokens())
            {
                
                StringBuilder ss = new StringBuilder(token.nextToken());
                kq.append(Character.toUpperCase(ss.charAt(0)));
                for(int j = 1;j < ss.length();j++)
                {
                    kq.append(Character.toLowerCase(ss.charAt(j)));
                }
                kq.append(" ");
            }
            System.out.println(kq.toString().trim());
        }
    }
}

