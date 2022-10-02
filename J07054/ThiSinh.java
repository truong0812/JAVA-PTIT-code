package J07054;

import java.util.StringTokenizer;


public class ThiSinh implements Comparable<ThiSinh> {
    public static int id = 0;
    private String ten,ma="SV";
    public double diem;
    public ThiSinh(String ten,int m1,int m2,int m3)
    {
        id++;
        ma +=String.format("%02d", id);
        this.ten = chuanhoa(ten);
        diem = trungbinh(m1,m2,m3);
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
    protected double trungbinh(int a,int b,int c)
    {
        return (a*3 + b*3 + c*2) / 8.0;
    }
    @Override
    public int compareTo(ThiSinh that)
    {
        if(this.diem == that.diem) return this.ma.compareTo(that.ma);
        return Double.compare(that.diem, this.diem);
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + String.format("%.2f", diem) + " ";
    }
}
