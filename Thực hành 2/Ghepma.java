import java.util.*;
import java.io.*;
public class Ghepma {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> a1 = new ArrayList<>();
        ArrayList <Integer> a2 = new ArrayList<>();
        TreeSet<String> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();
        a1 = (ArrayList<String>) ois1.readObject();
        a2 = (ArrayList<Integer>) ois2.readObject();
        ois1.close();
        ois2.close();
        for(String s:a1)
        {
            s1.add(s);
        }
        for(Integer i:a2)
        {
            s2.add(i);
        }
        TreeSet<String> res = new TreeSet<>();
        for(String s:s1)
        {
            for(Integer i:s2)
            {
                res.add(s+Integer.toString(i));
            }
        }
        for(String i:res)
        {
            System.out.println(i);
        }
    }
}
