package J07056;

public class KhachHang {
    private String maKH, hoTen, loai;
    private int chiSoDau, chiSoCuoi;
    private static int id = 1;
    
    public KhachHang(String hoTen, String loai, int chiSoDau, int chiSoCuoi) {
        this.maKH = "KH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.loai = loai;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }
    public void chuanHoaTen(){
        String[] arr = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }
    public int dinhMuc(){
        if("A".equals(this.loai))
            return 100;
        if("B".equals(this.loai))
            return 500;
        return 200;
    }
    public int soTrongDinhMuc(){
        int so = this.chiSoCuoi - this.chiSoDau;
        return so > this.dinhMuc() ? this.dinhMuc() : so;
    }
    public int soNgoaiDinhMuc(){
        return (this.chiSoCuoi - this.chiSoDau) - this.soTrongDinhMuc();
    }
    public int tongTien(){
        return (this.soTrongDinhMuc() * 450) + (this.soNgoaiDinhMuc() * 1000) + (int)(this.soNgoaiDinhMuc() * 50);
    }
    @Override
    public String toString(){
        return this.maKH + " " + this.hoTen + " " + (this.soTrongDinhMuc() * 450) + " " + (this.soNgoaiDinhMuc() * 1000)
                + " " + (int) (this.soNgoaiDinhMuc() * 50) + " " + this.tongTien();
    }
}
