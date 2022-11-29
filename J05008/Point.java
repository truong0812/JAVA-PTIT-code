package J05008;

public class Point {
    private double x,y;
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point that)
    {
        this.x = that.getX();
        this.y = that.getY();   
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double distance(Point p)
    {
        double a = (this.x - p.x) * (this.x - p.x);
        double b = (this.y - p.y) * (this.y - p.y);
        return Math.sqrt(a+b);
    }
    public static double distance(Point p1,Point p2)
    {
        double a = (p1.x - p2.x) * (p1.x - p2.x);
        double b = (p1.y - p2.y) * (p1.y - p2.y);
        return Math.sqrt(a+b);
    }
}
