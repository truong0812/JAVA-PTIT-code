package J05010;

public class MatHang implements Comparable<MatHang>{
    public static int id = 1;
    private int ma;
    private String tenhang,nhomhang;
    private double loinhuan;
    public MatHang(String tenhang,String nhomhang,double mua,double ban)
    {
        ma = id++;
        this.tenhang = tenhang;
        this.nhomhang = nhomhang;
        this.loinhuan = ban - mua;
    }
    @Override
    public String toString()
    {
        return ma + " " + tenhang + " " + nhomhang + " " + String.format("%.2f", loinhuan);
    }
    @Override
    public int compareTo(MatHang that)
    {
        return Double.compare(that.loinhuan, this.loinhuan);
    }
}
