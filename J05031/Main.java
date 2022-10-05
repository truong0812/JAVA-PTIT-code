package J05031;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maSV = sc.next();
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.next();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            list.add(new SinhVien(maSV, hoTen, lop, d1, d2, d3));
        }
        Collections.sort(list);
        for(int i = 0; i < n; i++){
            System.out.print(i + 1 + " ");
            System.out.println(list.get(i));
        }
    }
}
