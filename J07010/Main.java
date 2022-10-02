package J07010;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> set = new ArrayList<>();
        while (t-- > 0) {
             set.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(SinhVien x : set){
            System.out.println(x);
        }
    }
    
}
