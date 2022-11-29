package J05014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Teacher> kq = new ArrayList<>();
        for(int i=1;i <=t;i++)
        {
            kq.add(new Teacher(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(kq);
        for(Teacher i:kq)
        {
            System.out.println(i);
        }
        in.close();
    }
}
