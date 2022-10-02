package J07034;

class Monhoc implements Comparable<Monhoc>
{
    private String code,name,sotin;

    public Monhoc(String code ,String name, String sotin)
    {
        this.code = code;
        this.name = name;
        this.sotin = sotin;
    }
    @Override
    public String toString()
    {
        return code + " " + name + " " + sotin;
    }
    @Override
    public int compareTo(Monhoc that)
    {
        return this.name.compareTo(that.name);
    }
}