package J06003;

import java.util.*;

public class Nhom {
    private String tenBT;
    private ArrayList<SinhVien> dsSV;
    private int sttNhom;

    public Nhom(String tenBT, ArrayList<SinhVien> dsSV, int sttNhom) {
        this.tenBT = tenBT;
        this.dsSV = new ArrayList<>();
        this.sttNhom = sttNhom;
        for(SinhVien tmp : dsSV)
            if(tmp.getsttnhom() == sttNhom)
                this.dsSV.add(tmp);
    }
    public int getsttnhom()
    {
        return sttNhom;
    }
    
    @Override
    public String toString(){
        String s = String.format("DANH SACH NHOM %d:\n", this.sttNhom);
        for(SinhVien tmp : this.dsSV)
            s+= tmp+"\n";
        s += "Bai tap dang ky: "+this.tenBT;
        return s;
    }
}
