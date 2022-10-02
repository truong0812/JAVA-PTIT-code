import java.util.*;
public class J03005 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < t; i++)
        {
            Vector <String> res = new Vector<>();
            String s = sc.nextLine();
            StringTokenizer token = new StringTokenizer(s);
            while(token.hasMoreTokens())
            {
                StringBuilder ss = new StringBuilder(token.nextToken());
                StringBuilder kq = new StringBuilder();
                kq.append(Character.toUpperCase(ss.charAt(0)));
                for(int j = 1;j < ss.length();j++)
                {
                    kq.append(Character.toLowerCase(ss.charAt(j)));
                }
                res.add(kq.toString());
            }
            for(int j = 1 ; j < res.size();j++) 
            {
                if(j != 1) System.out.print(" ");
                System.out.print(res.get(j));
            }
            System.out.println(", " + res.get(0).toUpperCase());
        }
    }
}

