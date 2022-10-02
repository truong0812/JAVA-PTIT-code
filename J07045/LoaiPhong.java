package J07045;

import java.util.StringTokenizer;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu,ten,dongia,phidv;
    public LoaiPhong(String x)
    {
        StringTokenizer xx = new StringTokenizer(x);
        kyhieu = new String(xx.nextToken());
        ten = new String(xx.nextToken());
        dongia = new String(xx.nextToken());
        phidv = new String(xx.nextToken());
    } 
    @Override
    public String toString()
    {
        return kyhieu + " " + ten + " " + dongia + " " + phidv;
    }
    @Override
    public int compareTo(LoaiPhong that)
    {
        return this.ten.compareTo(that.ten);
    }
}
