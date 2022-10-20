package J06004;

import java.util.*;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV,tenSV,sdt,tenBT;
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
        public void settenBt(String x)
        {
            this.tenBT = x;
        }
        
        @Override
        public String toString(){
            return this.maSV+' '+this.tenSV+' '+this.sdt+' '
                    +String.valueOf(this.sttNhom)+' '+this.tenBT;
        }
        @Override
        public int compareTo(SinhVien o) {
            return this.maSV.compareTo(o.maSV);
        }
}
