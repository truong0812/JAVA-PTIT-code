package J05037;

public class MatHang implements Comparable<MatHang>{
    private String maHang, tenHang, donViTinh;
    private int donGia, soLuong;
    private static int id = 1;
    public MatHang(String tenHang, String donViTinh, int donGia, int soLuong) {
        this.maHang = "MH" + String.format("%02d", id++);
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
   
    public int phiVanChuyen(){
        return Math.round(this.donGia*this.soLuong*0.05f);
    }
    public int thanhTien(){
        return this.donGia * this.soLuong + this.phiVanChuyen();
    }
    public int giaBan(){
        return (int) Math.ceil(this.thanhTien() * 0.0102f/this.soLuong) * 100;
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.donViTinh +  " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
    }
    @Override
    public int compareTo(MatHang that)
    {
        return Integer.compare(that.giaBan(), this.giaBan());
    }
}
