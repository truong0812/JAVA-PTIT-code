package J05065;


public class Employee implements Comparable<Employee> {
    private String  name, position, coefficient, number;
    public Employee() {
    }
    public Employee(String code, String name) {
        this.name = name;
        this.position = code.substring(0,2);
        this.coefficient = code.substring(2, 4);
        this.number = code.substring(4);
    }
    public String getPosition() {
        return position;
    }
    public void setPosition() {
        this.position ="NV";
    }
    @Override
    public String toString() {
        return name + " " + position + " " + number + " " + coefficient;
    }
    @Override
    public int compareTo(Employee o) {
        if(o.coefficient.equals(this.coefficient)) return this.number.compareTo(o.number);
        else return o.coefficient.compareTo(this.coefficient);
    }
}