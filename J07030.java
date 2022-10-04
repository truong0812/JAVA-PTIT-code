import java.util.*;
import java.io.*;


public class J07030 {
    public static boolean check(int n)
    {
        if(n < 2) return false;
        if( n == 2 ) return true;
        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> data1 = (ArrayList<Integer>) file1.readObject();
        ArrayList<Integer> data2 = (ArrayList<Integer>) file2.readObject();
        file1.close();
        file2.close();
        TreeMap <Integer,Integer> set = new TreeMap<>();
        for(int i = 0;i < data1.size();i++)
        {
            int x = data1.get(i);
            if(x < 500000 && check(x) && check(1000000 - x) && data2.contains(1000000 - x))
            {
                set.put(x, 1000000 - x);
            }
        }
        for(Map.Entry<Integer,Integer> i:set.entrySet())
        {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
