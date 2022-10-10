import java.util.*;

public class J08024 {
    private static void solve(int n) {
        Queue <Long> q = new LinkedList<>();
        q.add(9l);
        while(!q.isEmpty()){
            long top = q.poll();
            if(top % n == 0){
                System.out.println(top);
                return;
            }
            q.add(10 * top);
            q.add(10 * top + 9);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            solve(n);
        }
    }
}