import java.io.*;
import java.util.*;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList <String> s = new ArrayList<>();
        while(in.hasNext())
        {
            String tmp = in.next();
            try
            {
                Integer.parseInt(tmp);
            }
            catch(Exception e)
            {
                s.add(tmp);
            }
        }
        Collections.sort(s);
        for(String i:s)
        {
            System.out.print(i + " ");
        }
    }
}
