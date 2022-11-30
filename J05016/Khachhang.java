package J05016;

import java.text.*;
import java.util.concurrent.TimeUnit;

public class Khachhang implements Comparable<Khachhang> {
    private static int[] dongia = {25,34,50,80};
    private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    private String ma,ten,phong;
    private long time,bonus;
    public Khachhang(int id,String name,String phong,String timein,String timeout,long bonus) throws ParseException
    {
        ma = String.format("KH%02d", id);
        ten = name;
        this.phong = phong;
        time = date.parse(timeout).getTime() - date.parse(timein).getTime();
        time = TimeUnit.DAYS.convert(time, TimeUnit.MILLISECONDS) + 1;
        this.bonus = bonus;
    }
    private long thanhtien()
    {
        return time * dongia[(int) (phong.charAt(0) - '1')] + bonus;
    }
    @Override
    public int compareTo(Khachhang that)
    {
        return Long.compare(that.thanhtien(), this.thanhtien());
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + phong + " " + time + " " + thanhtien();
    }
}
