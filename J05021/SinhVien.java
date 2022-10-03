package J05021;

public class SinhVien implements Comparable<SinhVien> {
    private String ma,hoTen,lop,email;
    public SinhVien(String ma,String hoTen,String lop,String email)
    {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public String toString()
    {
        return ma + " " + hoTen + " " + lop + " " + email;
    }
    @Override
    public int compareTo(SinhVien that)
    {
        return this.ma.compareTo(that.ma);
    }
}
