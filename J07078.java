import java.util.*;
import java.io.*;

public class J07078 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            for (int i=0;i <= s1.length() - s2.length();i++)
            {
                if(s1.substring(i, i+s2.length()).equals(s2)) System.out.printf("%d ",i+1);
            }
            System.out.println();
        }
        in.close();
    }
}
