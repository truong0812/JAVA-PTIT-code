package DanhSachthiICPC;

public class Team {
    private String ma, team , truong;
    public static int id = 1;
    public Team(String team,String truong)
    {
        ma = "Team" + String.format("%02d", id++);
        this.team = team;
        this.truong = truong;
    }
    public String getma()
    {
        return ma;
    }
    @Override
    public String toString()
    {
        return this.team + " " + this.truong;
    }
}
