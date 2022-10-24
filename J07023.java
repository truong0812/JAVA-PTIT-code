import java.io.*;
import java.util.*;

public class J07023 {
    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean isPrime[] = new boolean[10005];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < 10005; j += i)
                    isPrime[j] = false;
            }
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> arr1 = (ArrayList<Integer>) ois.readObject();
        SortedMap<Integer, Integer> cnt1 = new TreeMap<>();
        for (Integer x : arr1) {
            if (isPalindrome(x)) {
                if (isPrime[x]) {
                    if (!cnt1.containsKey(x))
                        cnt1.put(x, 0);
                    cnt1.put(x, cnt1.get(x) + 1);
                }
            }
        }
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arr2 = (ArrayList<Integer>) ois.readObject();
        SortedMap<Integer, Integer> cnt2 = new TreeMap<>();
        for (Integer x : arr2) {
            if (isPalindrome(x)) {
                if (isPrime[x]) {
                    if (!cnt2.containsKey(x))
                        cnt2.put(x, 0);
                    cnt2.put(x, cnt2.get(x) + 1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> x:cnt1.entrySet())
        {
            if(cnt2.containsKey(x.getKey()))
            {
                System.out.println(x.getKey() + " " + x.getValue()+ " " + cnt2.get(x.getKey()));
            }
        }
    }

}