package J05074;

public class SinhVien {
    private String ma,ten,lop;
    private int d=10;
    public SinhVien(String ma,String ten,String lop)
    {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    public String getma()
    {
        return ma;
    }
    public void diemcc(String x)
    {
        
        for(int i=0;i < x.length();i++)
        {
            if(x.charAt(i) == 'v') this.d-=2;
            if(x.charAt(i) == 'm') this.d-=1;
        }
        if(d < 0) d = 0;
    }
    public String dkdt()
    {
        String s="";
        if(d == 0) s="KDDK";
        return s;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + lop + " " + d + " " + dkdt(); 
    }
}
