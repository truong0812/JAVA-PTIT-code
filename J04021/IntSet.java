package J04021;

import java.util.*;

public class IntSet {
    TreeSet <Integer> set;

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    public IntSet(int[] a) {
        this.set = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            this.set.add(a[i]);
        }
    }
    
    public IntSet union(IntSet other){
        TreeSet <Integer> kq = new TreeSet<>();
        for(int x : this.set){
            kq.add(x);
        }
        for(int x : other.set){
            kq.add(x);
        }
        return new IntSet(kq);
    }
    @Override
    public String toString(){
        String ans = "";
        for(int x : this.set)
            ans += x + " ";
        return ans;
    }
}
