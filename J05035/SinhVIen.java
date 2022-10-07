package J05035;

public class SinhVIen implements Comparable<SinhVIen>{
    private String  ma, ten,lop,email,doanhnghiep;
    private int stt;
    public static int id = 1;
    public SinhVIen(String ma,String ten,String lop,String email,String doanhnghiep)
    {
        stt = id++;
        this.ten = ten;
        this.doanhnghiep = doanhnghiep;
        this.email = email;
        this.ma = ma;
        this.lop = lop;
    }
    public String getdoanhnghiep()
    {
        return doanhnghiep;
    }
    @Override
    public int compareTo(SinhVIen that)
    {
        return this.ma.compareTo(that.ma);
    }
    @Override
    public String toString()
    {
        return stt + " " + ma.trim() + " " + ten.trim() + " " + lop.trim() + " " + email.trim() + " " + doanhnghiep;
    }
}
