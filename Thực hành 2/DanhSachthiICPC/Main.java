package DanhSachthiICPC;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Team> team = new ArrayList<>();
        ArrayList <ThiSinh> ts = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            team.add(new Team(in.nextLine(), in.nextLine()));
        }
        t = Integer.parseInt(in.nextLine());
        while(t-- > 0)
        {
            ts.add(new ThiSinh(in.nextLine(), in.nextLine()));
        }
        Collections.sort(ts);
        for(ThiSinh i:ts)
        {
            for(Team j:team)
            {
                if(i.getmateam().equals(j.getma())) 
                {
                    System.out.println(i + " " + j);
                    break;
                }
            }
            
        }
    }
}
