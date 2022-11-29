package J05008;

import java.util.*;

public class Dagiac {
    private int sodinh;
    private ArrayList <Point> dinh = new ArrayList<>();
    public Dagiac(int n,Scanner in)
    {
        this.sodinh = n;
        for(int i=0;i < sodinh;i++)
        {
            dinh.add(new Point(in.nextInt(), in.nextInt()));
        }
    }
    private static double dttamgiac(Point p1,Point p2,Point p3)
    {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        double p = (d1 + d2 +d3)/2.0;
        return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
    }
    public String dtdagiac()
    {
        double kq = 0.0;
        for (int i=1;i < sodinh - 1;i++)
        {
            kq += dttamgiac(dinh.get(0), dinh.get(i), dinh.get(i+1));
        }
        return String.format("%.3f", kq);
    }
}
