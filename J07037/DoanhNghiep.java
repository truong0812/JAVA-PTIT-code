package J07037;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String code,name,ssv;
    public DoanhNghiep(String code ,String name,String ssv)
    {
        this.code = code;
        this.name = name;
        this.ssv = ssv;
    }
    @Override
    public String toString()
    {
        return code + " " + name + " " + ssv ;
    }
    @Override
    public int compareTo(DoanhNghiep that)
    {
        return this.code.compareTo(that.code);
    }
}
