package J04018;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc res1 = SoPhuc.mul(a, SoPhuc.add(a, b));
            SoPhuc res2 = SoPhuc.mul(SoPhuc.add(a, b), SoPhuc.add(a, b));
            System.out.println(res1 + ", " + res2);
        }
    }
}
