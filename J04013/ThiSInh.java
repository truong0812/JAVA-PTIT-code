package J04013;

class ThiSInh{
    private String maThiSinh, hoTen;
    private float diemToan, diemLy, diemHoa;

    public ThiSInh(String maThiSinh, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public float diemUuTien(){
        String khuVuc = this.maThiSinh.substring(0, 3);
        if("KV1".equals(khuVuc)) return 0.5f;
        if("KV2".equals(khuVuc)) return 1f;
        return 2.5f;
    }
    public float tongDiem(){
        return 2*this.diemToan + this.diemLy + this.diemHoa;
    }
    public String trangThai(){
        float diemXetTuyen = this.tongDiem() + this.diemUuTien();
        if(diemXetTuyen >= 24)
            return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString(){
        String diemUuTien = "" + ((this.diemUuTien() == (int) this.diemUuTien()) ? (int) this.diemUuTien() : String.format("%.1f", this.diemUuTien()));
        String tongDiem = "" + ((this.tongDiem() == (int) this.tongDiem()) ? (int) this.tongDiem() : String.format("%.1f", this.tongDiem()));        
        return this.maThiSinh + " " + this.hoTen + " " + diemUuTien + " " + tongDiem + " " + this.trangThai();
    }
}