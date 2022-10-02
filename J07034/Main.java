package J07034;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Monhoc> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Monhoc(in.nextLine(),in.nextLine(),in.nextLine()));
        }
        Collections.sort(kq);
        for(Monhoc i:kq)
        {
            System.out.println(i);
        }
    }
}
