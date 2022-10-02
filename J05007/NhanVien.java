package J05007;

public class NhanVien implements Comparable<NhanVien>{
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKiHD;
    private static int id = 1;
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKiHD) {
        this.maNhanVien = String.format("%05d", id++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKiHD = ngayKiHD;
    }
   
    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh
                + " " + this.diaChi + " " + this.maThue + " " + this.ngayKiHD;
    }

    @Override
    public int compareTo( NhanVien that) {
        String cmp1 = this.ngaySinh.substring(6) + this.ngaySinh.substring(3, 5) + this.ngaySinh.substring(0, 2);
        String cmp2 = that.ngaySinh.substring(6) + that.ngaySinh.substring(3, 5) + that.ngaySinh.substring(0, 2);
        return cmp1.compareTo(cmp2);
    }
}
