package J05028;

public class DoanhNghiep implements Comparable <DoanhNghiep> {
    private String maDoanhNghiep, tenDoanhNghiep;
    private int soSinhVien;

    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVien) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVien = soSinhVien;
    }
    
    @Override
    public String toString(){
        return this.maDoanhNghiep + " " + this.tenDoanhNghiep + " " + this.soSinhVien;
    }
    @Override
    public int compareTo(DoanhNghiep that)
    {
        if(this.soSinhVien == that.soSinhVien) return this.maDoanhNghiep.compareTo(that.maDoanhNghiep);
        return Integer.compare(that.soSinhVien, this.soSinhVien);
    }
}
