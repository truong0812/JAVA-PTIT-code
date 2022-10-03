package J05009;

import java.util.*;;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <ThiSinh> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(kq);
        Double x = kq.get(0).gettongdiem();
        int i =0;
        while(true)
        {
            if(kq.get(i).gettongdiem() != x) break;
            System.out.println(kq.get(i));
            i++;
        }
    }
}
