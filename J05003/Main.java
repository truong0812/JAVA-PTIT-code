package J05003;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++){ 
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
            System.out.println(sv);
        }
    }
}
