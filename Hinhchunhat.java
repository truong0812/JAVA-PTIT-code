import java.util.*;

public class Hinhchunhat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x <= 0 || y <= 0) System.out.println("0");
        else
        {
            System.out.println((x+y)*2+" "+x*y);
        }

    }
}

