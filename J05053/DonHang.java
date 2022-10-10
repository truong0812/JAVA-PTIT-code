package J05053;

public class DonHang implements Comparable<DonHang>{
    private String tenHang, maDonHang;
    private int donGia, soLuong;

    public DonHang(String tenHang, String maDonHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String soThuTu(){
        return this.maDonHang.substring(1, 4);
    }
    public int maLoai(){
        return this.maDonHang.charAt(this.maDonHang.length() - 1) - '0';
    }
    public int giamGia(){
        if(this.maLoai() == 1)
            return (int)(0.5 * this.donGia * this.soLuong);
        return (int)(0.3 * this.donGia * this.soLuong);
    }
    public int thanhTien(){
        return this.donGia * this.soLuong - this.giamGia();
    }
    
    @Override
    public String toString(){
        return this.tenHang + " " + this.maDonHang + " " + this.soThuTu()
                + " " + this.giamGia() + " " + this.thanhTien();
    }
    @Override
    public int compareTo(DonHang that)
    {
        return this.soThuTu().compareTo(that.soThuTu());
    }
}
