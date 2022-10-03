package J05009;

public class ThiSinh implements Comparable<ThiSinh>{
    private String hoTen,ngaysinh;
    private int ma;
    private double tongdiem;
    public static int id = 1;
    public ThiSinh(String hoTen,String ngaysinh,double m1,double m2,double m3)
    {
        ma = id++;
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.tongdiem = m1 + m2 + m3;
    }
    public double gettongdiem()
    {
        return tongdiem;
    }
    @Override
    public String toString()
    {
        return ma + " " + hoTen + " " + ngaysinh + " " +  tongdiem;
    }
    @Override
    public int compareTo(ThiSinh that)
    {
        if(this.tongdiem == that.tongdiem) return Integer.compare(this.ma, that.ma);
        return Double.compare(that.tongdiem, this.tongdiem);
    }
}
