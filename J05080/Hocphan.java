package J05080;

public class Hocphan implements Comparable<Hocphan>{
    private String code, name, team, teacher;
    public Hocphan() {

    }
    public Hocphan(String code, String name, String team, String teacher) {
        this.code = code;
        this.name = name;
        this.team = team;
        this.teacher = teacher;
    }
    public String getCode(){
        return code;
    }
    public String getName() {
        return name;
    } 
    public String getTeam() {
        return team;
    }
    public String getTeacher() {
        return teacher;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + team;
    }
    @Override
    public int compareTo(Hocphan o) {
        if( this.code.equals(o.code)) return this.team.compareTo(o.team);
        return this.code.compareTo(o.code);
    }
}
