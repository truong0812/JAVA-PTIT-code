package J05018;

import java.math.*;

public class HocSinh implements Comparable<HocSinh>{
    public static int id = 1;
    private String ma,ten;
    private BigDecimal tong = new BigDecimal("0");
    public HocSinh(String ten,BigDecimal[] d) {
        ma = "HS" + String.format("%02d", id++);
        this.ten = ten;
        for(int i = 0; i < 10; i++){
            tong = tong.add(d[i]);
        }
        tong = tong.add(d[0]);
        tong = tong.add(d[1]);
        BigDecimal div = new BigDecimal("12");
        tong = tong.divide(div, 1, RoundingMode.HALF_UP);
        
    }
    protected String xepLoai(){
        if(this.tong.compareTo(BigDecimal.valueOf(9)) >= 0)
            return "XUAT SAC";
        if(this.tong.compareTo(BigDecimal.valueOf(8)) >= 0)
            return "GIOI";
        if(this.tong.compareTo(BigDecimal.valueOf(7)) >= 0)
            return "KHA";
        if(this.tong.compareTo(BigDecimal.valueOf(5)) >= 0)
            return "TB";
        return "YEU";
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " +  tong  + " " + xepLoai();
    }
    @Override
    public int compareTo(HocSinh that)
    {
        if(this.tong.equals(that.tong)) return this.ma.compareTo(that.ma);
        return that.tong.compareTo(this.tong);
    }
}
