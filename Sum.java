import java.util.*;

public class Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i < t;i++)
        {
            long x = sc.nextLong();
            System.out.println(((1+x)*x)/2);
        }
    }
    
        
    
}
