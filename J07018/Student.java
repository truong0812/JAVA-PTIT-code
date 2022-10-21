package J07018;

import java.text.*;
import java.util.Date;

public class Student {
    private String code, name, class_name;
    private Date dob;
    private double gpa;
    public Student(){
    }
    public Student(int n, String name, String class_name, String dob, double gpa) throws ParseException {
        this.code = "B20DCCN" + String.format("%03d", n);
        this.name = chuanHoa(name);
        this.class_name = class_name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }
    private String chuanHoa(String x) {
        String[] s = x.trim().split("\\s++");
        String tmp = "";
        for(String i : s) {
            tmp += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return tmp.trim();
    }
    @Override
    public String toString() {
        return code + " " + name + " " + class_name + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
    }
}
