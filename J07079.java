import java.util.*;
import java.io.*;
public class J07079 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> data = (ArrayList<String>) file.readObject();
        for(String i:data)
        {
            String res = "";
            for(int j = 0;j < i.length();j++ )
            {
                if(i.charAt(j) == '1' || i.charAt(j) == '0') res += i.charAt(j);
            }
            System.out.println(res + " " + Long.parseLong(res,2));
        }
    }
}
