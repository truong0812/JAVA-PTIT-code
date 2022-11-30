package J05019;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        Map <String,Rain> kq = new HashMap<>();
        ArrayList <String> key = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            String ten = in.nextLine();
            String begin = in.nextLine();
            String end = in.nextLine();
            int rain = Integer.parseInt(in.nextLine());
            if(kq.containsKey(ten)) kq.get(ten).update(begin, end, rain);
            else 
            {
                kq.put(ten, new Rain(ten, begin, end, rain));
                key.add(ten);
            }
        }
        for (String i:key)
        {
            System.out.println(kq.get(i));
        }
        in.close();
    }
}
