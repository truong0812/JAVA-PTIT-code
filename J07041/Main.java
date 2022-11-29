package J07041;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Scanner in = new Scanner(System.in);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Pair> data = (ArrayList<Pair>) in.readObject();
        in.close();
        Set <Pair> kq = new TreeSet<>();
        for(Pair x:data)
        {
            if(x.getFirst() >= x.getSecond()) continue;
            kq.add(x);
        }
        /*while(true)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x == 0 && y == 0) break;
            kq.add(new Pair(x, y));
        }*/
        for(Pair x:kq)
        {
            System.out.println(x);
        }
    }
}
