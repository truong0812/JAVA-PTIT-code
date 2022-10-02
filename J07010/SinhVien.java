package J07010;

import java.text.*;
import java.util.*;
class SinhVien 
{
    public static int id = 0;
    private String name, classmate, code = "B20DCCN";
    private Date dateofbirth;
    private String GPA;
    public SinhVien(String name,String classmate,String date,String GPA) throws ParseException
    {
        id++;
        this.name = name;
        this.classmate = classmate;
        this.GPA = String.format("%.2f", Double.parseDouble(GPA));
        this.dateofbirth = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.code = code + String.format("%03d", id);
    }
    @Override
    public String toString()
    {
        return code + " " + name + " " + classmate + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateofbirth) + " " + GPA;
    }
}
