import java.util.*;
public class J02104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int x;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1; j <= n;j++)
            {
                x = Integer.parseInt(in.next());
                if(j > i && x == 1)
                {
                    System.out.println("("+ i + "," + j + ")");
                }
            }
        }
    }
}
