package J05057;

public class ThiSinh {
    private String ma,ten;
    private double tongdiem;
    public ThiSinh(String ma,String ten,double t,double l,double h)
    {
        this.ma = ma;
        this.ten = ten;
        tongdiem = t*2.0 + l + h ;
    }
    private double uutien()
    {
        if(ma.startsWith("KV1")) return 0.5;
        if(ma.startsWith("KV2")) return 1.0;
        return 2.5;
    }
    private String getuutien()
    {
        if(uutien() == (int) uutien()) return String.format("%d", (int) uutien());
        return String.format("%.1f", uutien());
    }
    private String gettongdiem()
    {
        if(tongdiem == (int) tongdiem) return String.format("%d", (int) tongdiem);
        return String.format("%.1f", tongdiem);
    }
    private String check()
    {
        if(tongdiem + uutien() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.getuutien() + " " + this.gettongdiem() + " " + check();
    }
}
