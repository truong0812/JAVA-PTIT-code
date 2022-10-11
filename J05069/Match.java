package J05069;

import java.util.List;

public class Match {
    private Club club;
    private String id;
    private int fan, sale;
    public Match() {
    }
    public Match(String id, int fan, List<Club> clubs) {
        this.id = id;
        this.fan = fan;
        this.club = solveClub(clubs);
        this.sale = fan*club.getPrice();
    }
    private Club solveClub(List<Club> clubs) {
        int x = 0;
        for(int i = 0; i < clubs.size(); i++) {
            if(id.substring(1,3).equals(clubs.get(i).getId())) {
                x = i;
                break;
            }
        }
        return clubs.get(x);
    }
    @Override
    public String toString() {
        return id + " " + club.getName() + " " + sale;
    }
}
