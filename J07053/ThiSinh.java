package J07053;

import java.util.StringTokenizer;

class ThiSinh{
    private String maThiTuyen, hoTen, ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    private static int id = 1;
    
    public ThiSinh(String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.maThiTuyen = "PH" + String.format("%02d", id++);
        this.hoTen = chuanHoa(hoTen);
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    protected String chuanHoa(String s){
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder();
        while(ss.hasMoreTokens())
        {
            StringBuilder sss = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(sss.charAt(0)));
            for(int i = 1;i < sss.length();i++)
            {
                kq.append(sss.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public int getTuoi() {
        String[] arr = this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(arr[2]);
    }

    public double diemThuong(){
        if(this.diemLyThuyet >= 8 && this.diemThucHanh >= 8)
            return 1;
        if(this.diemLyThuyet >= 7.5 && this.diemThucHanh >= 7.5)
            return 0.5;
        return 0;
    }
    public long diemTrungBinh(){
        double tb = (this.diemLyThuyet + this.diemThucHanh) / 2;
        if(tb + this.diemThuong() > 10)
            return 10;
        return  Math.round(tb + this.diemThuong());
    }
    public String xepLoai(){
        long d = this.diemTrungBinh();
        if(d >= 9)
            return "Xuat sac";
        if(d >= 8)
            return "Gioi";
        if(d >= 7)
            return "Kha";
        if(d >= 5)
            return "Trung binh";
        return "Truot";
    }
    
    @Override
    public String toString(){
        return this.maThiTuyen + " " + this.hoTen + " " + this.getTuoi() + " " + this.diemTrungBinh() + " " + this.xepLoai();
    }
}
