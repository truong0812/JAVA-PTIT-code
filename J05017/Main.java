package J05017;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Water> kq = new ArrayList<>();
        for(int i =1; i<= t;i++)
        {
            kq.add(new Water(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(kq);
        for(Water i : kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
