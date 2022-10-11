package J05068;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            MatHang matHang = new MatHang(input.next(), Integer.parseInt(input.next()));
            list.add(matHang);
        }
        Collections.sort(list);
        for(MatHang matHang : list) {
            System.out.println(matHang);
        }
        input.close();
    }
}
