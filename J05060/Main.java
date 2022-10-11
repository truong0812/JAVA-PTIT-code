package J05060;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            System.out.println(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        in.close();
    }
}

