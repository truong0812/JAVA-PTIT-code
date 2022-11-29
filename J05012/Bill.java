package J05012;

public class Bill implements Comparable<Bill> {
    private String ma,ten;
    private long slg,dongia,chietkhau;
    public Bill(String ma,String ten,long slg,long dongia,long chietkhau)
    {
        this.ma = ma;
        this.ten = ten;
        this.slg = slg;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }
    public long thanhtien()
    {
        return slg * dongia - chietkhau;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + slg + " " + dongia + " " + chietkhau + " " + thanhtien(); 
    }
    @Override
    public int compareTo(Bill that)
    {
        return Long.compare(that.thanhtien(), this.thanhtien());
    }
}
