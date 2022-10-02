import java.util.*;

class Point
{
    private double x;
    private double y;
    public Point(){}
    public Point(double a,double b) 
    {
        this.x = a;
        this.y = b;
    }
    public Point(Point that)
    {
        this.x = that.x;
        this.y = that.y;
    }
    public double setX()
    {
        return x;
    }
    public double setY()
    {
        return y;
    }
    public double distance (Point that)
    {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public static double distance(Point p1,Point p2)
    {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    @Override
    public String toString()
    {
        return x + " " + y;
    }

}

public class J04010 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            Point x = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            Point y = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            Point z = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            Double a = x.distance(y);
            Double b = y.distance(z);
            Double c = z.distance(x);
            if(a + b <= c || a + c <= b || c+b <= a) System.out.println("INVALID");
            else
            {
                Double s = (0.25) * Math.sqrt( (a+b+c) * (a+b-c) * (a+c-b) * (b+c-a) );
                Double r = (a*b*c) / (4.0*s);
                System.out.printf("%.3f\n",Math.PI * r * r);
            }
        }
    }
}
