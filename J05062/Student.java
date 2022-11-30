package J05062;

public class Student implements Comparable<Student>{
    private String name, kq;
    private double tbc, rl;
    public Student(){}
    public Student(String name, double tbc, double rl) {
        this.name = name;
        this.tbc = tbc;
        this.rl = rl;
        this.kq = solveKq();
    }
    private String solveKq() {
        String tmp;
        if(tbc >= 3.6 && rl >= 90) tmp = "XUATSAC";
        else if(tbc >= 3.2 && rl >= 80) tmp = "GIOI";
        else if(tbc >= 2.5 && rl >= 70) tmp = "KHA";
        else tmp = "KHONG";
        return tmp;
    }
    public double getTbc() {
        return tbc;
    }
    public void setKq() {
        this.kq = "KHONG";
    }
    @Override
    public String toString() {
        return name + ": " + kq;
    }
    @Override
    public int compareTo(Student o) {
        if(o.tbc > this.tbc) return 1;
        else if(o.tbc < this.tbc) return -1;
        else return 0;
    }
}