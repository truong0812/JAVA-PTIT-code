package J05038;

public class NhanVien {
    private String maNV, tenNV;
    private int luongNgay, soNgayCong;
    private String chucVu;
    public static int id = 1, tongTienLuong = 0;

    public NhanVien(String tenNV, int luongNgay, int soNgayCong, String chucVu) {
        this.maNV = "NV" + String.format("%02d", id++);
        this.tenNV = tenNV;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        tongTienLuong += this.thuNhap();
    }
    public int luongThang(){
        return this.luongNgay * this.soNgayCong;
    }
    public int thuong(){
        if(this.soNgayCong >= 25)
            return (int) (this.luongThang() * 0.2);
        if(this.soNgayCong >= 22)
            return (int) (this.luongThang() * 0.1);
        return 0;
    }
    public int phuCap(){
        if(this.chucVu.equals("GD"))
            return 250000;
        if(this.chucVu.equals("PGD"))
            return 200000;
        if(this.chucVu.equals("TP"))
            return 180000;
        return 150000;
    }
    public int thuNhap(){
        return this.luongThang() + this.thuong() + this.phuCap();
    }
    @Override
    public String toString(){
        return this.maNV + " " + this.tenNV + " " + this.luongThang() + " " + this.thuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
}
