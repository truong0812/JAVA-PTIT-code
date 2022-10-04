package J05024;

public class SinhVien {
    private String id,name,clas,email;

    public SinhVien(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }    
    public String getIndustry(){
        if(id.contains("DCKT"))  return "Ke toan";
        if(id.contains("DCVT"))  return "Vien thong";
        if(id.contains("DCDT"))  return "Dien tu";
        if(id.contains("DCCN") && id.charAt(0) != 'E')  return "Cong nghe thong tin";
        if(id.contains("DCAT") && id.charAt(0) != 'E')  return "An toan thong tin";
        return "";
    }
    
    @Override
    public String toString(){
        return this.id+' '+this.name+' '+this.clas+' '+this.email;
    }
}
