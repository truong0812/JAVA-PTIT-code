package J05079;

public class Hocphan implements Comparable<Hocphan>{
    private String code, name, team, teacher;
    
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
    @Override
    public String toString() {
        return team + " " + teacher;
    }
    @Override
    public int compareTo(Hocphan o) {
        return this.team.compareTo(o.team);
    }
}
