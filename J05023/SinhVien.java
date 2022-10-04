package J05023;

public class SinhVien {
    
    private String id,name,clas,email;
    
    public SinhVien(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }    
    public String getkhoa()
    {
        return "20" + clas.substring(1, 3);
    }
        
    @Override
    public String toString(){
        return this.id+' '+this.name+' '+this.clas+' '+this.email;
    }
}

