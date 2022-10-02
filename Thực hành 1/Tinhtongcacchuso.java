import java.util.*;
public class Tinhtongcacchuso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            String s =in.next();
            int len = s.length();
            ArrayList <Character> a = new ArrayList<>();
            int sum = 0;
            for(int i =0; i < len;i++)
            {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
                {
                    a.add(s.charAt(i));
                }
                else
                {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            Collections.sort(a,((o1, o2) -> o1.compareTo(o2)));
            for(Character i:a) System.out.print(i);
            
            System.out.println(sum);
        }
    }
}
