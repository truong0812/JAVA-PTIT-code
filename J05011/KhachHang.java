package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable<KhachHang>{
    private String makh,tenkh;
    private long sogio,sophut;
    public KhachHang(String makh,String tenkh,String timein,String timeout) throws ParseException
    {
        this.makh = makh;
        this.tenkh = tenkh;
        SimpleDateFormat x = new SimpleDateFormat("HH:mm");
        sophut = x.parse(timeout).getTime() - x.parse(timein).getTime();
        sophut = TimeUnit.MINUTES.convert(sophut, TimeUnit.MILLISECONDS);
        sogio = sophut/60;
        sophut %=60;
    }
    @Override
    public String toString()
    {
        return makh + " " + tenkh + " " + sogio + " gio " + sophut + " phut";
    }
    @Override
    public int compareTo(KhachHang that)
    {
        if(this.sogio == that.sogio) return Long.compare(that.sophut, this.sophut);
        return Long.compare(that.sogio, this.sogio);
    }
}
