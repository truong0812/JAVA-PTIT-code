import java.util.*;

public class J01025 {
    static Scanner sc = new Scanner(System.in);

    static void Solve() {
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) a[i] = sc.nextInt();
        int max = a[0] , min = a[0];
        for (int i = 0; i < 8; i+=2)
        {
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }
        int c = max - min;
        max = a[1] ;
        min = a[1];
        for (int i = 1; i < 8; i+=2)
        {
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }
        c = Math.max(c,max - min);
        System.out.println(c*c);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}