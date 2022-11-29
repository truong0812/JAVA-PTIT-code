package J07038;

public class DataInternship {
    public Student intern;

    public DataInternship(Student intern) {
        this.intern = intern;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", intern.code, intern.name, intern.className);
    }
}
