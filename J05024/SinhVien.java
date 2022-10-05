package J05024;

public class SinhVien {
    private String maSV, hoTen, lop, email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    public String nganhHoc(){
        String tmp = this.maSV.substring(5, 7);
        if(this.lop.charAt(0) != 'E' && tmp.equals("CN"))
            return "CONG NGHE THONG TIN";
        if(tmp.equals("KT"))
            return "KE TOAN";
        if(this.lop.charAt(0) != 'E' && tmp.equals("AT"))
            return "AN TOAN THONG TIN";
        if(tmp.equals("VT"))
            return "VIEN THONG";
        if(tmp.equals("DT"))
            return "DIEN TU";
        return "";
    }
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email; 
    }
}
