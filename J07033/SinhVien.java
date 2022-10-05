package J07033;

import java.util.StringTokenizer;

class SinhVien implements Comparable<SinhVien>
{
    private String ma,lop,ten,mail;
    public SinhVien(String ma,String ten,String lop,String mail)
    {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.mail = mail;
    }
    private String chuanhoa(String s)
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
    public String getlop()
    {
        return lop;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + lop + " " + mail;
    }
    @Override
    public int compareTo(SinhVien that)
    {
        return this.ma.compareTo(that.ma);
    }
}