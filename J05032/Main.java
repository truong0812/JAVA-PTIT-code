package J05032;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <Nguoi> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Nguoi(in.nextLine()));
        }
        Collections.sort(kq);
        System.out.println(kq.get(kq.size() - 1));
        System.out.println(kq.get(0));
    }
}
