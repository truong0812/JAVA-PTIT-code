package J07009;

import java.util.*;

public class IntSet {
    private TreeSet<Integer> set;
    public IntSet (){}
    public IntSet(int[] a) {
        TreeSet<Integer> x = new TreeSet<>();
        for(int i = 0; i < a.length; i++) {
            x.add(a[i]);
        }
        this.set = x;
    }
    public IntSet intersection(IntSet o) {
        int[] dd = new int[1001];
        int cnt = 0;
        for(Integer i : this.set) {
            if(o.set.contains(i)) {
                dd[i] = 1;
                cnt++;
            }
        }
        int[] a = new int[cnt];
        int j = 0;
        for(int i = 0; i < 1001; i++) {
            if(j == cnt) {
                break;
            }
            if(dd[i] == 1) {
                a[j] = i;
                j++;
            }
        }  
        IntSet res = new IntSet(a);
        return res;
    }
    @Override
    public String toString() {
        String s = "";
        for(Integer i : set) {
            s += Integer.toString(i) + " ";
        }
        return s.trim();
    }
}
