package J07051;

import java.io.*;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Client> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Client(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine())));
        }
        Collections.sort(kq);
        for(Client i:kq)
        {
            System.out.println(i);
        }
    }
}
