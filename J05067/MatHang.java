package J05067;

public class MatHang {
    private String ma, hang;
    private int don_gia;
    private double so_luong;
    private double thanh_tien, tien, thue;
    public MatHang(){}
    public MatHang(String ma, double so_luong) {
        this.ma = ma;
        this.so_luong = so_luong;
        this.hang = solveHang();
        this.don_gia = solveDon_gia();
        this.tien = don_gia*so_luong;
        this.thue = solveThue();
        this.thanh_tien = tien + thue;
    }
    private String solveHang() {
        String tmp = ma.substring(3);
        String ans;
        if(tmp.equals("BP")) ans = "British Petro";
        else if(tmp.equals("ES")) ans = "Esso";
        else if(tmp.equals("SH")) ans = "Shell";
        else if(tmp.equals("CA")) ans = "Castrol";
        else if(tmp.equals("MO")) ans = "Mobil";
        else ans = "Trong Nuoc";
        return ans;
    }
    private int solveDon_gia() {
        String tmp = ma.substring(0, 1);
        int ans;
        if(tmp.equals("X")) ans = 128000;
        else if(tmp.equals("D")) ans = 11200;
        else ans = 9700;
        return ans;
    }
    private double solveThue() {
        String tmp = ma.substring(0, 1);
        double ans;
        double x = tien;
        if(tmp.equals("X")) ans = x*3/100;
        else if(tmp.equals("D")) ans = (x*3.5) / 100;
        else ans = x*2/100;
        String cmp = ma.substring(3);
        if(cmp.equals("TN")) ans = 0;
        return ans;
    }
    @Override
    public String toString() {
        return ma + " " + hang + " " + don_gia + " " + String.format("%.0f %.0f", thue, thanh_tien);
    }
}
