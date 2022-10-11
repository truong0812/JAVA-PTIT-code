package J05069;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Club> clubs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Club club = new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            clubs.add(club);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            Match match = new Match(sc.next(), Integer.parseInt(sc.next()), clubs);           
            list.add(match); 
        }
        for(Match match : list) {
            System.out.println(match);
        }
        sc.close();
    }
}
