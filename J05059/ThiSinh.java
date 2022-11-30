package J05059;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, kq;
    private double toan, ly, hoa, ut, tong;
    public ThiSinh() {
    }
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.ut = solveUt();
        this.tong = toan*2 + ly + hoa + ut;
    }
    private double solveUt() {
        double tmp;
        int x = Integer.parseInt(ma.substring(2,3));
        if(x == 1) tmp = 0.5;
        else if(x == 2) tmp = 1.0;
        else tmp = 2.5;
        return tmp;
    }
    public void setKq(double x) {
        if(tong >= x) this.kq = "TRUNG TUYEN";
        else this.kq = "TRUOT";
    }
    public double getTong() {
        return tong;
    }
    private String inUt() {
        if((int)ut == ut) return String.format("%.0f", ut);
        else return String.format("%.1f", ut);
    }
    private String inTong() {
        if((int)tong == tong) return String.format("%.0f", tong);
        else return String.format("%.1f", tong);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + inUt() + " " + inTong() + " " + kq;
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(o.tong > this.tong) return 1;
        else if(o.tong < this.tong) return -1;
        else return 0;
    }
}