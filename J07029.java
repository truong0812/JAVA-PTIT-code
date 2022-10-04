import java.util.*;
import java.io.*;


public class J07029 {

    public static boolean check(int n)
    {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> data = (ArrayList<Integer>) file.readObject();
        file.close();
        TreeMap <Integer,Integer> set = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0 ;i < data.size();i++)
        {
            if(set.containsKey(data.get(i)))
            {
                int x = set.get(data.get(i));
                x++;
                set.put(data.get(i), x);
            }
            else
            {
                if(!check(data.get(i))) continue;
                set.put(data.get(i), 1);
            }
        }
        int x = 0;
        for(Map.Entry<Integer,Integer> i : set.entrySet())
        {
            System.out.println(i.getKey() + " " + i.getValue());
            x++;
            if(x == 10) break;
        }  
    }    
}
