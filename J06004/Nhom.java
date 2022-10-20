package J06004;

import java.util.ArrayList;

public class Nhom {
    private String tenBT;
    private ArrayList<SinhVien> dsSV;
    private int sttNhom;

    public Nhom(String tenBT, ArrayList<SinhVien> dsSV, int sttNhom) {
        this.tenBT = tenBT;
        this.dsSV = new ArrayList<>();
        this.sttNhom = sttNhom;
        for(SinhVien tmp : dsSV)
            if(tmp.getsttnhom() == sttNhom){
                this.dsSV.add(tmp);
                tmp.settenBt(tenBT);
            }
    }
}
