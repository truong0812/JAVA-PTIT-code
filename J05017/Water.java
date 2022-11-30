package J05017;

public class Water implements Comparable<Water>{
    private String ma,ten;
    private int slg;
    public Water(int id,String ten,int begin,int end)
    {
        ma = String.format("KH%02d", id);
        this.ten = ten;
        slg = end - begin;
    }
    private double phuphi()
    {
        if(slg <= 50) return 1.02;
        if(51 <= slg  && slg <= 100) return 1.03;
        return 1.05;
    }
    private int thanhtien()
    {
        int tien = 0;
        if(slg >= 50) 
        {
            tien += 50 * 100;
            if(slg >= 100) tien += (50 *150) + ((slg - 100) * 200);
            else tien +=(slg - 50) * 150; 
        }
        else tien += slg * 100;
        return (int) Math.round(tien * phuphi());
    }
    @Override
    public int compareTo(Water that)
    {
        return Integer.compare(that.thanhtien(), this.thanhtien());
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + thanhtien();
    }
}
