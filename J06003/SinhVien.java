package J06003;

import java.util.*;

public class SinhVien{
    private String maSV,tenSV,sdt;
    private int sttNhom;

    public SinhVien(Scanner sc) {
        this.maSV = sc.next();
        sc.nextLine();
        this.tenSV = sc.nextLine();
        this.sdt = sc.next();
        this.sttNhom = sc.nextInt();
    }
    public int getsttnhom()
    {
        return sttNhom;
    }
    
    @Override
    public String toString(){
        return this.maSV+' '+this.tenSV+' '+this.sdt;
    }
}
