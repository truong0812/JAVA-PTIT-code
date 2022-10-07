package J05032;

public class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private String[] tuoi;
    public Nguoi(String x)
    {
        String[] arr = x.split("\\s+");
        ten = arr[0];
        tuoi = arr[1].split("/");
    }
    private String tuoi()
    {
        return tuoi[2] + tuoi[1] + tuoi[0];
    }
    @Override
    public int compareTo(Nguoi that)
    {
        return this.tuoi().compareTo(that.tuoi());
    }
    @Override
    public String toString()
    {
        return ten;
    }
}
