package J05042;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int baidung,summit;
    public SinhVien(String ten,String bai)
    {
        this.ten =ten;
        String[] arr = bai.split("\\s+");
        this.baidung = Integer.parseInt(arr[0]);
        this.summit = Integer.parseInt(arr[1]);
    }

    @Override
    public String toString()
    {
        return ten + " " + baidung + " " + summit;
    }
    @Override 
    public int compareTo(SinhVien that)
    {
        if(this.baidung == that.baidung && this.summit == that.summit) return this.ten.compareTo(that.ten);
        if(this.baidung == that.baidung) return Integer.compare(this.summit, that.summit);
        return Integer.compare(that.baidung, this.baidung);
    }
}
