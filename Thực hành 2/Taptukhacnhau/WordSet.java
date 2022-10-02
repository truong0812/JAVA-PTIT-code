package Taptukhacnhau;

import java.util.*;

public class WordSet {
    private TreeSet <String> set;

    public WordSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public WordSet(String s){
        set = new TreeSet<>();
        s = s.trim();
        String[] arr = s.split("\\s+");
        for(String x : arr)
            set.add(x.toLowerCase());
    }
    public WordSet union(WordSet other){
        TreeSet <String> tmp = new TreeSet<>();
        for(String x : this.set){
            tmp.add(x);
        }
        for(String x : other.set){
            tmp.add(x);
        }
        return new WordSet(tmp);
    }
    public WordSet intersection(WordSet other){
        TreeSet <String> tmp = new TreeSet<>();
        for(String x : this.set){
            if(other.set.contains(x)){
                tmp.add(x);
            }
        }
        return new WordSet(tmp);
    }
    
    @Override
    public String toString(){
        String ans = "";
        for(String x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}
