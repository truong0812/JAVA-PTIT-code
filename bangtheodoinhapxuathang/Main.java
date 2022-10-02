package bangtheodoinhapxuathang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<HangHoa> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            HangHoa hangHoa = new HangHoa(input.nextLine(), Long.parseLong(input.nextLine()));
            list.add(hangHoa);
        }
        for(HangHoa hangHoa : list) {
            System.out.println(hangHoa);
        } 
        input.close();
    }
}
