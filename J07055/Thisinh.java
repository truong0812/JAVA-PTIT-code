package J07055;

import java.util.StringTokenizer;

public class Thisinh implements Comparable<Thisinh>{
    private String maSV, hoTen;
    private double diem;
    private static int id = 1;

    public Thisinh(String hoTen, double d1, double d2, double d3) {
        this.maSV = "SV" + String.format("%02d", id++);
        this.hoTen = chuanhoa(hoTen);
        this.diem = trungbinh(d1,d2,d3);
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
    protected double trungbinh(double a,double b,double c)
    {
        return (a*0.25 + b*0.35 + c*0.4);
    }
    public String xepLoai(){
        if(diem >= 8) return "GIOI";
        if(diem >= 6.5) return "KHA";
        if(diem >= 5) return "TRUNG BINH";
        return "KEM";
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + String.format( "%.2f",diem) + " " + this.xepLoai();
    }
    @Override
    public int compareTo(Thisinh that)
    {
        return Double.compare(that.diem, this.diem);
    }
}
