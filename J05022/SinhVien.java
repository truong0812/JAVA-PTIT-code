package J05022;

public class SinhVien {
    private String id,name,clas,email;

    public SinhVien(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }    
    public String getclas()
    {
        return clas;
    }
    
    @Override
    public String toString(){
        return this.id+' '+this.name+' '+this.clas+' '+this.email;
    }
}

