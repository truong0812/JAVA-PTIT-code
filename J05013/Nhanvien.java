package J05013;

public class Nhanvien implements Comparable<Nhanvien> {
    private String ma,ten;
    private double diem;
    public Nhanvien(int id,String ten,double d1,double d2)
    {
        ma = String.format("TS%02d", id);
        this.ten = ten;
        if(d1 > 10) d1 /= 10.0;
        if(d2 > 10) d2 /= 10.0;
        this.diem = (d1 + d2) / 2.0;
    }
    private String danhgia()
    {
        if(diem < 5.0) return "TRUOT";
        if(5.0 <= diem && diem < 8) return "CAN NHAC";
        if(8.0 <= diem && diem < 9.5) return "DAT";
        return "XUAT SAC";
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + String.format("%.2f", diem) + " " + danhgia();
    }
    @Override
    public int compareTo(Nhanvien that)
    {
        return Double.compare(that.diem, this.diem);
    }
}
