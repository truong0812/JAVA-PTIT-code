package J05060;

public class ThiSinh {
    private String ma,ten,DOB;
    private long tongdiem;
    public static int id = 1;
    public ThiSinh(String ten,String DOB,Double d1,Double d2)
    {
        this.DOB = DOB;
        this.ten = ten;
        ma = "PH" + String.format("%02d", id++);
        tongdiem = Math.round((d1 + d2) / 2.0 + uutien(d1,d2));
    }
    private String tuoi()
    {
        return String.format("%d", 2021 - Integer.parseInt(DOB.substring(6)));
    }
    private double uutien(double d1,double d2)
    {
        if(d1 >= 8.0 && d2 >= 8.0) return 1.0;
        if(d1 >= 7.5 && d2 >= 7.5) return 0.5;
        return 0.0;
    }
    private String gettongdiem()
    {
        if(tongdiem > 10) tongdiem = 10;
        return String.format("%d", tongdiem);
    }
    private String xeploai()
    {
        if(tongdiem < 5) return "Truot";
        if(tongdiem <= 6) return "Trung binh";
        if(tongdiem == 7) return "Kha";
        if(tongdiem == 8) return "Gioi";
        return "Xuat sac";
    }
    @Override 
    public String toString()
    {
        return ma + " " + ten + " " + tuoi() + " " + gettongdiem() + " " + xeploai(); 
    }
}
