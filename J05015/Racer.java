package J05015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Racer implements Comparable<Racer> {
    public static SimpleDateFormat time = new SimpleDateFormat("H:mm");
    private static String start = "6:00";
    private String ten,team,code = "";
    private double v,t;
    public Racer(String ten,String team,String end) throws ParseException
    {
        this.ten = ten;
        this.team = team;
        StringTokenizer x = new StringTokenizer(team);
        while(x.hasMoreTokens())
        {
            code += x.nextToken().charAt(0);
        }
        x = new StringTokenizer(ten);
        while(x.hasMoreTokens())
        {
            code += x.nextToken().charAt(0);
        }
        long thoigian = time.parse(end).getTime() - time.parse(start).getTime();
        thoigian = TimeUnit.MINUTES.convert(thoigian, TimeUnit.MILLISECONDS);
        t = (double)thoigian/60.0;
        v = 120.0 / t;
    }
    @Override
    public int compareTo(Racer that)
    {
        return Double.compare(that.v, this.v);
    }
    @Override
    public String toString()
    {
        return code + " " + ten + " " + team + " " + Math.round(v) + " Km/h";
    }
}
