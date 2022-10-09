package J05045;

public class NhanVien implements Comparable<NhanVien> {
    private String maNV, hoTen, chucVu;
    private int luongCoBan, soNgayCong;
    private static int id = 1;
    public NhanVien(String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        this.maNV = "NV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public String getChucVu() {
        return chucVu;
    }
    
    public int phuCap(){
        if("GD".equals(this.chucVu))
            return 500;
        if("PGD".equals(this.chucVu))
            return 400;
        if("TP".equals(this.chucVu))
            return 300;
        if("KT".equals(this.chucVu))
            return 250;
        return 100;
    }
    public int luongChinh(){
        return this.luongCoBan * this.soNgayCong;
    }
    public int tamUng(){
        int tmp = this.phuCap() + this.luongChinh();
        if(tmp * 2.0/3 < 25000)
            return (int) Math.round(tmp*2.0/3000)*1000;
        return 25000;
    }
    public int thuNhap(){
        return this.luongChinh() + this.phuCap();
    }
    public int conLai(){
        return this.thuNhap() - this.tamUng();
    }
    
    @Override
    public String toString(){
        return this.maNV + " " + this.hoTen + " " + this.phuCap() + " " + this.luongChinh() + " " + this.tamUng() + " " + this.conLai();
    }
    @Override
    public int compareTo(NhanVien that)
    {
        return Integer.compare(that.thuNhap(), this.thuNhap());
    }
}
