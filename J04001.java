import java.util.*;
import static java.lang.Math.*;

class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    public static double distance(Point a, Point b)
    {
        return a.distance(b);
    }

    public String toString() {
        return "POINT [x=" + x + ", y=" + y + "]";
    }
}

public class J04001 {
    static Scanner sc = new Scanner(System.in);

    static void Solve() {
        Point a = new Point(sc.nextDouble(), sc.nextDouble());
        Point b = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.printf("%.4f\n", Point.distance(a, b));
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0)
            Solve();
    }
}