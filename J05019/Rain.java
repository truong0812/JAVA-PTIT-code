package J05019;

import java.text.*;
import java.util.concurrent.TimeUnit;

public class Rain  {
    public static int id = 1;
    private static SimpleDateFormat f = new SimpleDateFormat("HH:mm");
    private String ten,ma;
    private long sophut;
    private double luongmua,time;
    public Rain(String ten,String begin,String end,int rain) throws ParseException
    {
        ma = String.format("T%02d", id++);
        this.ten = ten;
        sophut = f.parse(end).getTime() - f.parse(begin).getTime();
        sophut = TimeUnit.MINUTES.convert(sophut, TimeUnit.MILLISECONDS);
        luongmua = rain;
    }
    public void update(String begin,String end,int rain) throws ParseException
    {
        luongmua += rain;
        long x = f.parse(end).getTime() - f.parse(begin).getTime();
        x = TimeUnit.MINUTES.convert(x, TimeUnit.MILLISECONDS);
        sophut += x;
    }
    private String luongmuatb()
    {
        time = (double) sophut / 60.0;
        double res = luongmua / time;
        return String.format("%.2f", res);
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + luongmuatb();
    }
}
