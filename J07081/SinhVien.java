package J07081;

public class SinhVien implements Comparable<SinhVien>{
    private String ma,hoTen,sodt,email;
    private String ho,dem,ten;
    public SinhVien(String ma,String hoTen,String sodt,String email)
    {
        this.ma = ma;
        this.hoTen = hoTen;
        String[] arr = hoTen.split(" ");
        ho = arr[0];
        ten = arr[arr.length - 1];
        dem ="";
        for(int i=1;i <arr.length - 1;i++) dem += arr[i];
        this.sodt = sodt;
        this.email = email;
    }
    @Override
    public String toString()
    {
        return ma + " " + hoTen + " " + sodt + " " + email;
    }
    @Override
    public int compareTo(SinhVien that)
    {
        if(this.hoTen.equals(that.hoTen)) return this.ma.compareTo(that.ma);
        if(this.ten.equals(that.ten) && this.ho.equals(that.ho)) return this.dem.compareTo(that.dem);
        if(this.ten.equals(that.ten)) return this.ho.compareTo(that.ho);
        return this.ten.compareTo(that.ten);
    }
}
