package DanhSachthiICPC;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma , ten, mateam;
    private Team team;
    public static int id = 1;
    public ThiSinh(String ten,String mateam)
    {
        ma = "C" + String.format("%03d",id++);
        this.ten = chuanhoa(ten);
        this.mateam = mateam;
    }
    protected String chuanhoa(String s)
    {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder();
        while(ss.hasMoreTokens())
        {
            StringBuilder sss = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(sss.charAt(0)));
            for(int i=1;i < sss.length();i++)
            {
                kq.append(sss.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public String getmateam()
    {
        return mateam;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten ;
    }
    @Override
    public int compareTo(ThiSinh that)
    {
        return this.ten.compareTo(that.ten);
    }
}
