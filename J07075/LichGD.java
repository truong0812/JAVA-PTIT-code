package J07075;

public class LichGD implements Comparable<LichGD> {
    private String id,thu,kip,tengv,phong;
    private Monhoc sub;
    public LichGD(int id,Monhoc sub,String thu,String kip,String tengv,String phong)
    {
        this.id = "HP" + String.format("%03d", id);
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.phong = phong;
        this.sub = sub;
    }
    public String gettengv()
    {
        return tengv;
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
        return this.id + " " + sub.getten() + " " + thu + " " + kip + " " + " " + phong; 
    }
}
