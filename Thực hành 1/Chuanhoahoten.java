import java.util.*;
public class Chuanhoahoten {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            StringTokenizer x = new StringTokenizer(s);
            ArrayList <String> ss = new ArrayList<>();
            while(x.hasMoreTokens())
            {
                StringBuilder k = new StringBuilder(x.nextToken());
                StringBuilder kq = new StringBuilder();
                kq.append(Character.toUpperCase(k.charAt(0)));
                for(int i = 1;i < k.length();i++) kq.append(Character.toLowerCase(k.charAt(i)));
                ss.add(kq.toString());
            }
            if (n == 1)
            {
                System.out.print(ss.get(ss.size() - 1) + " ");
                for(int i = 0 ;i < ss.size() - 1;i++)
                {
                    System.out.print(ss.get(i) + " ");
                }
                System.out.println();
            }
            else
            {
                for(int i = 1 ;i < ss.size();i++)
                {
                    System.out.print(ss.get(i) + " ");
                }
                System.out.print(ss.get(0) + " ");

                System.out.println();
            }
        }
        
    }
}

