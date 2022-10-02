package Luyentaplaptrinh;

import java.util.*;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int baidung,summit;
    public SinhVien(String ten,String bai)
    {
        this.ten = chuanhoa(ten);
        
        this.baidung = Integer.parseInt(bai.substring(0, 3));
        this.summit = Integer.parseInt(bai.substring(4));
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
    @Override
    public String toString()
    {
        return ten + " " + baidung + " " + summit;
    }
    @Override 
    public int compareTo(SinhVien that)
    {
        if(this.baidung == that.baidung && this.summit == that.summit) return this.ten.compareTo(that.ten);
        if(this.baidung == that.baidung) return Integer.compare(this.summit, that.summit);
        return Integer.compare(that.baidung, this.baidung);
    }
}
