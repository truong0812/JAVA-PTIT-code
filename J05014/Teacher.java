package J05014;

public class Teacher implements Comparable<Teacher> {
    public static String[] sub = {"TOAN","LY","HOA"};
    public static double[] uutien = {2.0,1.5,1.0,0.0};
    private String ten,mon,ma;
    private double diem;
    public Teacher(int id,String ten,String code,double d1,double d2)
    {
        ma = String.format("GV%02d", id);
        this.ten = ten;
        int x = code.charAt(0) - 'A';
        mon = sub[x];
        x = code.charAt(1) - '1';
        diem = d1 * 2.0 + d2 + uutien[x];
    }
    private String xeploai()
    {
        if(diem >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }
    @Override
    public int compareTo(Teacher that)
    {
        return Double.compare(that.diem, this.diem);
    }
    @Override
    public String toString()
    {
        return ma +" " + ten +" " + mon + " " + String.format("%.1f", diem) + " " + xeploai(); 
    }
}
