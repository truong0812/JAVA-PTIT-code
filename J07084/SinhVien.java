package J07084;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SinhVien implements Comparable<SinhVien>{
    public static SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String hoTen;
    private long sophut;
    public SinhVien(String hoTen,String timein,String timeout) throws ParseException
    {
        this.hoTen = chuanhoa(hoTen);
        sophut = x.parse(timeout).getTime() - x.parse(timein).getTime();
        sophut = TimeUnit.MINUTES.convert(sophut, TimeUnit.MILLISECONDS);
    }
    protected String chuanhoa(String s)
    {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder();
        while(ss.hasMoreTokens())
        {
            StringBuilder sss = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(sss.charAt(0)));
            for(int i = 1;i < sss.length();i++)
            {
                kq.append(sss.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    @Override
    public String toString()
    {
        return hoTen + " " + sophut;
    }
    @Override
    public int compareTo(SinhVien that)
    {
        if(this.sophut == that.sophut) this.hoTen.compareTo(that.hoTen);
        return Long.compare(that.sophut, this.sophut);
    }
}
