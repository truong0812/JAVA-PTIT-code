package J07074;

public class LichGD implements Comparable<LichGD> {
    private String id,ma,thu,kip,tengv,phong;
    public LichGD(int id,String ma,String thu,String kip,String tengv,String phong)
    {
        this.ma = ma;
        this.id = "HP" + String.format("%03d", id);
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.phong = phong;
    }
    public String getma()
    {
        return ma;
    }
    @Override
    public int compareTo(LichGD other)
    {
        if(this.thu.equals(other.thu) && this.kip.equals(other.kip)) return this.tengv.compareTo(other.tengv);
        if(this.thu.equals(other.thu)) return this.kip.compareTo(other.kip);
        return this.thu.compareTo(other.thu);
    }
    @Override
    public String toString()
    {
        return this.id + " " + thu + " " + kip + " " + tengv + " " + phong; 
    }
}
