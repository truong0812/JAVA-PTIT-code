import java.util.*;
import java.io.*;

public class J07021 {

    public static String Chuanhoa(String s)
    {
        StringTokenizer ss = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder("");
        while(ss.hasMoreTokens())
        {
            StringBuilder sss = new StringBuilder(ss.nextToken().toLowerCase());
            kq.append(Character.toUpperCase(sss.charAt(0)));
            for(int i = 1; i < sss.length();i++)
            {
                kq.append(sss.charAt(i));
            }
            kq.append(" ");
        }
        return  kq.toString().trim();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(true)
        {
            String s = in.nextLine();
            if(s.equals("END")) break;
            System.out.println(Chuanhoa(s));
        }
    }
}

