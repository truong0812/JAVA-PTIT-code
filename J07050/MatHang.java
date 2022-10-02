package J07050;

public class MatHang implements Comparable<MatHang>{
    public static int id = 0;
    private String name,group,code = "MH";
    private double loinhuan;
    public MatHang (String name,String group ,double mua,double ban)
    {
        id++;
        code += String.format("%02d", id);
        this.name = name;
        this.group = group;
        loinhuan = ban - mua;
    }
    @Override
    public String toString()
    {
        return code + " " + name + " " + group + " " + String.format("%.2f", loinhuan);
    }
    @Override
    public int compareTo(MatHang that)
    {
        return Double.compare(that.loinhuan, this.loinhuan);
    }
}
