import java.util.*;

class Point
{
    private double x,y;
    public Point(double a, double b)
    {
        this.x = a;
        this.y = b;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public static double distance(Point p1, Point p2)
    {
        double a = (p1.x - p2.x) * (p1.x - p2.x);
        double b = (p1.y - p2.y) * (p1.y - p2.y);
        return Math.sqrt(a+b);
    }
    public double distance(Point p)
    {
        double a = (this.x - p.x) * (this.x - p.x);
        double b = (this.y - p.y) * (this.y - p.y);
        return Math.sqrt(a+b);
    }
    @Override
    public String toString()
    {
        return "[ " + x + " " + y + " ]" ;
    }
}
public class J04009 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(in.next());
        while(t-- > 0)
        {
            Point a = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            Point b = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            Point c = new Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            double x = Point.distance(a,b);
            double y = Point.distance(c,b);
            double z = Point.distance(a,c);
            if( x+y == z || x+z == y || z+y == x) System.out.println("INVALID");
            else{
                double p = (x + y + z)/2;
                System.out.printf("%.2f\n", Math.sqrt(p*(p-x)*(p-y)*(p-z))  );
            }
        }
    }
    
}
