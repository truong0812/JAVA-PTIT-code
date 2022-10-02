import java.lang.*;
import java.util.*;

class Time
{
    private int h,m,s;
    public Time(){}
    public Time(int a,int b,int c){
        h=a;
        m=b;
        s=c;
    } 
    public long change()
    {
        return h*3600 + m*60 + s;
    }
    
    
    @Override
    public String toString()
    {
        return h + " " + m + " " + s;
    }
}


public class J05033 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.next());
        ArrayList <Time> kq = new ArrayList<>();
        while(t-- > 0)
        {
            kq.add(new Time(Integer.parseInt(in.next()),Integer.parseInt(in.next()),Integer.parseInt(in.next())));
        }
        Collections.sort(kq,new Comparator<Time>() {
            public int compare(Time a,Time b)
            {
                return a.change() < b.change() ? -1 : 1;
            }
        });
        for(Time i:kq)
        {
            System.out.println(i.toString());
        }
    }
}
    