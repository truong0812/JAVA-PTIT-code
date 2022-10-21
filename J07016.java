import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class J07016 {
    private static boolean[] a = new boolean[10001];
    private static void sangnto() {
        for(int i=0;i <= 10000;i++) a[i] = true;
        a[0] = a[1] = false;
        for(int i = 2;i <=105;i++)
        {
            if(a[i]) for(int j=i*i; j <= 10000;j+=i) a[j] = false;
        }

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1 = (ArrayList<Integer>) ois1.readObject();
        a2 = (ArrayList<Integer>) ois2.readObject();
        ois1.close();
        ois2.close();
        sangnto();
        int[] dd1 = new int[10000];
        int[] dd2 = new int[10000];
        for(int i : a1) {
            if(a[i]) {
                dd1[i]++;
            }
        }
        for(int i : a2) {
            if(a[i]) {
                dd2[i]++;
            }
        }
        for(int i = 0; i < 10000; i++) {
            if(dd1[i] > 0 && dd2[i] > 0) {
                System.out.println(i + " " + dd1[i] + " " + dd2[i]);
            }
        }
    }
}
