import java.util.*;
import java.io.*;

public class Sokhonggiam {
    private static boolean check(int n)
    {
        String s = Integer.toString(n);
        if(s.length() < 2) return false;
        for(int i = 0 ;i < s.length() - 1;i++)
        {
            if(Character.valueOf(s.charAt(i)) > Character.valueOf(s.charAt(i+1))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> a1 = new ArrayList<>();
        ArrayList <Integer> a2 = new ArrayList<>();
        a1 = (ArrayList<Integer>) ois1.readObject();
        a1 = (ArrayList<Integer>) ois2.readObject();
        ois1.close();
        ois2.close();
        int[] dd1 = new int[10000];
        int[] dd2 = new int[10000];
        for(Integer i:a1)
        {
            if(check(i))
            {
                dd1[i]++;
            }
        }
        for(Integer i:a2)
        {
            if(check(i)) dd2[i]++;
        }
        for(int i = 0 ;i < 10000;i++)
        {
            if(dd1[i] != 0 && dd2[i] != 0)
            {
                System.out.println(String.format("%d %d %d", i,dd1[i],dd2[i]));
            }
        }
    }
}
