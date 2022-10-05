package J05030;

public class SinhVien implements Comparable <SinhVien>{
    private String maSV, hoTen, lop;
    private float d1, d2, d3;

    public SinhVien(String maSV, String hoTen, String lop, float d1, float d2, float d3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public int compareTo(SinhVien that)
    {
        return this.maSV.compareTo(that.maSV);
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + String.format("%.1f %.1f %.1f", this.d1, this.d2, this.d3);
    }
}
