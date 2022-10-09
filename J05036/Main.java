package J05036;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList <MatHang> kq = new ArrayList<>();
        while(n -- > 0){
            kq.add(new MatHang(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        for(MatHang x : kq){
            System.out.println(x);
        }
    }
}
