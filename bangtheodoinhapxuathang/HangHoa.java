package bangtheodoinhapxuathang;

public class HangHoa {
    private String ma;
    private long nhap, xuat, don_gia, tien, thue;
    public HangHoa(){};
    public HangHoa(String ma, long nhap) {
        this.ma = ma;
        this.nhap = nhap;
        this.xuat = solveXuat(ma);
        this.don_gia = solveDon_gia(ma);
        this.tien = don_gia*xuat;
        this.thue = solveThue(ma);
    }
    private long solveXuat(String s) {
        String cmp = s.substring(0,1);
        double tmp;
        if(cmp.equals("A")) {
            tmp = nhap*0.6;
        }
        else {
            tmp = nhap*0.7;
        }
        long res = (long) (Math.round(tmp));
        return res;
    }
    private long solveDon_gia(String s) {
        String cmp = s.substring(4);
        long res;
        if(cmp.equals("Y")) res = 110000;
        else res = 135000;
        return res;
    }
    private long solveThue(String s) {
        String cmp = s.substring(0, 1) + s.substring(4);
        long tmp = don_gia*xuat;
        long res;
        if(cmp.equals("AY")) res = tmp*8/100;
        else if(cmp.equals("AN")) res = tmp*11/100;
        else if(cmp.equals("BY")) res = tmp*17/100;
        else res = tmp*22/100;
        return res;
    }
    @Override
    public String toString() {
        return ma + " " + nhap + " "  + xuat + " " + don_gia + " " + tien + " " + thue;
    }
}
