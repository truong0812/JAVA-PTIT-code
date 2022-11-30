package J05059;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(thiSinh);
        }
        int i = sc.nextInt();
        Collections.sort(list);
        double dc = list.get(i - 1).getTong();
        System.out.printf("%.1f\n", dc);
        for(ThiSinh j : list) {
            j.setKq(dc);
            System.out.println(j);
        }
        sc.close();
    }
}
