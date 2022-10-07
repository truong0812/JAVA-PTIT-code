package J05034;

public class SinhVien implements Comparable<SinhVien>{
    private String  ma, ten,lop,email,doanhnghiep;
    private int stt;
    public static int id = 1;
    public SinhVien(String ma,String ten,String lop,String email,String doanhnghiep)
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
    public int compareTo(SinhVien that)
    {
        return this.ten.compareTo(that.ten);
    }
    @Override
    public String toString()
    {
        return stt + " " + ma.trim() + " " + ten.trim() + " " + lop.trim() + " " + email.trim() + " " + doanhnghiep;
    }
}
