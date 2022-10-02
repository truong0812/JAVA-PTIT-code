package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;;

public class SinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;
    private static int id = 1;

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) throws ParseException {
        this.maSV = "B20DCCN" + String.format("%03d", id++);
        this.hoTen = chuanhoaTen(hoTen);
        this.lop = lop;
        Date ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
        this.gpa = gpa;
    }

    protected String chuanhoaTen(String s)
    {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder();
        while(ss.hasMoreTokens())
        {
            StringBuilder sss = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(sss.charAt(0)));
            for(int i =1 ; i < sss.length();i++)
            {
                kq.append(sss.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    
    @Override
    public String toString(){
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
