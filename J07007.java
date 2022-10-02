import java.io.*;
import java.util.*;

class WordSet
{
    private TreeSet <String> set;
    public WordSet(String file) throws FileNotFoundException  {
        set = new TreeSet<>();
        Scanner in = new Scanner(new File(file));
        while(in.hasNext())
        {
            set.add(in.next().toLowerCase());
        }
    }
    @Override
    public String toString()
    {
        String s = "";
        for(String x:set)
        {
            s += x + "\n";

        }
        return s;
    }
}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
