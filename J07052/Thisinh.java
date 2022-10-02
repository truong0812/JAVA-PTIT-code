package J07052;

import java.util.*;

public class Thisinh implements Comparable <Thisinh>{
    private String code,name;
    private double tongdiem;
    public Thisinh(String code ,String name,double toan,double ly, double hoa)
    {
        this.code = code;
        this.name = chuanhoa(name);
        this.tongdiem = toan*2 +ly+hoa +uutien(code);
    }
    protected double uutien(String s)
    {
        if(s.startsWith("KV1")) return 0.5;
        if(s.startsWith("KV2")) return 1.0;
        return 2.5;
    }
    protected String chuanhoa(String s)
    {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder("");
        while(ss.hasMoreTokens())
        {
            StringBuilder token = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(token.charAt(0)));
            for (int i =1; i < token.length();i++)
            {
                kq.append(token.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public double gettongdiem()
    {
        return tongdiem;
    }
    @Override
    public String toString()
    {
        String diemUuTien = String.format("%.1f", uutien(code));
        if (uutien(code) == (int) uutien(code))
            diemUuTien = String.format("%.0f", uutien(code));
        String diemXetTuyen = "";
        if(this.tongdiem == (int) this.tongdiem)
            diemXetTuyen = String.format("%.0f", this.tongdiem);
        else
            diemXetTuyen = String.format("%.1f", this.tongdiem);
        return code + " " + name + " " + diemUuTien + " " + diemXetTuyen;
    }
    @Override
    public int compareTo(Thisinh that)
    {
        return Double.compare(that.tongdiem, this.tongdiem);
    }
}
