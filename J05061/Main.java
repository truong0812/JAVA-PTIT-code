package J05061;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer t = Integer.parseInt(in.nextLine());
        ArrayList <ThiSinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(kq);
        for(ThiSinh x:kq)
        {
            System.out.println(x);
        }
        in.close();
    }
}

