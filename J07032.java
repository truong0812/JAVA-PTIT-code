import java.util.*;
import java.io.*;

public class J07032 {
    public static boolean check(int n)
    {
        String x1 = String.valueOf(n);
        if(x1.length() % 2 == 0 || x1.length() == 1) return false;
        StringBuilder x2 = new StringBuilder(x1);
        if(!x2.reverse().toString().equals(x1)) return false;
        for(int i = 0 ; i < x1.length(); i++){
            if((x1.charAt(i) - '0') % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> data1 = (ArrayList<Integer>) file1.readObject();
        ArrayList <Integer> data2 = (ArrayList<Integer>) file2.readObject();
        file1.close();file2.close();
        TreeMap <Integer,Integer> set = new TreeMap<>();
        for(int i = 0 ;i < data1.size();i++)
        {
            if(set.containsKey(data1.get(i)))
            {
                int x = set.get(data1.get(i));
                x++;
                set.put(data1.get(i), x);
            }
            else
            {
                if(check(data1.get(i)) && data2.contains(data1.get(i)))
                {
                    set.put(data1.get(i), 1);
                }
            }
        }
        for(int i = 0 ;i < data2.size();i++)
        {
            if(set.containsKey(data2.get(i)))
            {
                int x = set.get(data2.get(i));
                x++;
                set.put(data2.get(i), x);
            }
        }
        int i = 0;
        for(Map.Entry<Integer,Integer> x:set.entrySet())
        {
            System.out.println(x.getKey() + " " + x.getValue());
            i++;
            if(i == 10) break;
        }
    }
}
