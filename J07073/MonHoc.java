package J07073;

public class MonHoc implements Comparable<MonHoc> {
    private String ma,tenmon,sotin,day,th;
    public MonHoc(String ma,String tenmon,String sotin,String day,String th)
    {
        this.ma = ma;
        this.tenmon = tenmon;
        this.sotin = sotin;
        this.day = day;
        this.th = th;
    }
    public String getth()
    {
        return th;
    }
    @Override
    public String toString()
    {
        return ma + " " + tenmon + " " + sotin + " " + day + " " + th;
    }
    @Override 
    public int compareTo(MonHoc that)
    {
        return this.ma.compareTo(that.ma);
    }
}
