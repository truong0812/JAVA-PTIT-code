import java.util.*;

public class J02023 {

    public static String max(int x,int n)
    {
        String a = "";
        for(int i=0;i< n;i++){
            if(x > 9) {
                a +="9";
                x -= 9;
            }
            else
            {
                a += String.valueOf(x);
                x = 0;
            } 
        }
        return a;
    }

    public static String min(int x,int n)
    {
        String a = "";
        for(int i = 0 ;i < n;i++)
        {
            if(x > 9) 
            {
                a += "9";
                x -= 9;
            }
            else
            {
                if(i == n-1)
                {
                    if(x == 0) a = "1" + a;
                    else a = String.valueOf(x) + a;
                }
                else 
                {
                    if(x == 0) a = "0" + a;
                    else
                    {
                    a = String.valueOf(x - 1) + a;
                    x = 0;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        if(k==0||k>n*9){
            System.out.println("-1 -1");
        }
        else{
            System.out.println(min(k,n)+" "+max(k,n));
        }
    }
}