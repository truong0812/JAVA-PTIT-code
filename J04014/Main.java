package J04014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo tmp1 = PhanSo.add(a, b);
            PhanSo res1 = PhanSo.mul(tmp1, tmp1);
            PhanSo res2 = PhanSo.mul(a, PhanSo.mul(b, res1));
            System.out.println(res1 + " " + res2);
        }
    }
}
