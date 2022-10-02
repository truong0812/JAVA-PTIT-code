package J07048;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> set = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            set.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(set);
        for(Product x : set){
            System.out.println(x);
        }
    }
}
