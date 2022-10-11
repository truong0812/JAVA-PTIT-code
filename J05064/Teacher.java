package J05064;

public class Teacher {
    private String id, name;
    private long basic_salary;
    public Teacher(String id, String name, long basic_salary) {
        this.id = id;
        this.name = name;
        this.basic_salary = basic_salary;
    }
    public long getAllowance(){
        if(this.id.substring(0, 2).equals("HT")) {
            return  2000000;
        }
        else if(this.id.substring(0, 2).equals("HP") ) {
            return  900000;
        }
        else {
            return  500000;
        }
    }
    public long getCoefficient() {
        return Integer.parseInt(id.substring(2));
    }
    public long getSalary() {
        return this.basic_salary*getCoefficient() + getAllowance();
    }
   
    @Override
    public String toString() {
        return id + " " + name + " " + getCoefficient() + " " + getAllowance() + " " + getSalary();
    }
}
