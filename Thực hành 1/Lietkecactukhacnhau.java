import java.util.*;
public class Lietkecactukhacnhau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = Integer.parseInt(in.nextLine());
        Set <String> s1 = new TreeSet<>();
        Set <String> s2 = new TreeSet<>();
        while(n-- > 0)
        {
            String s = in.nextLine();
            StringTokenizer ss = new StringTokenizer(s.toLowerCase());
            while(ss.hasMoreTokens())
            {
                s1.add(ss.nextToken());
            }
        }
        n = Integer.parseInt(in.nextLine());
        while(n-- > 0)
        {
            String s = in.nextLine();
            StringTokenizer ss = new StringTokenizer(s.toLowerCase());
            while(ss.hasMoreTokens())
            {
                s2.add(ss.nextToken());
            }
        }
        for(String i:s1)
        {
            if(!s2.contains(i)) System.out.print(i + " ");
        }
        System.out.println();
        for(String i:s2)
        {
            if(!s1.contains(i)) System.out.print(i + " ");
        }
    }
}
