import java.util.*;
public class Giaocuahaidayso {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int x1[] = new int[a], x2[] = new int[b];
        for(int i = 0; i < a;i++) x1[i] = sc.nextInt();
        for(int i = 0; i < b;i++) x2[i] = sc.nextInt();
        Arrays.sort(x1);
        Arrays.sort(x2);
        int i = 0, j = 0;
        while(i < a && j < b)
        {
            if(i != 0 && x1[i] == x1[i-1]) 
            {
                i++;
                continue;
            }
            if(j != 0 && x2[j] == x2[j-1]) 
            {
                j++;
                continue;
            }
            if(x1[i] == x2[j])
            {
                System.out.print(x1[i] + " ");
                i++;j++;
            }
            else
            {
                if(x1[i] > x2[j]) j++;
                else i++;
            }
        }
    }
}
