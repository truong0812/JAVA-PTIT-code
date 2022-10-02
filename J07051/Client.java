package J07051;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Client implements Comparable<Client>{
    public static int id = 0;
    private String code = "KH", name, room;
    private long time, money;
   
    public Client(String name,String room, String timein ,String timeout, long bonus) throws ParseException
    {
        id++;
        this.code +=String.format("%02d", id);
        this.name = chuanhoa(name);
        this.room = room;
        time = new SimpleDateFormat("dd/MM/yyyy").parse(timeout).getTime() - new SimpleDateFormat("dd/MM/yyyy").parse(timein).getTime();
        time = TimeUnit.DAYS.convert(time, TimeUnit.MILLISECONDS) + 1;
        this.money = check(bonus);
    }
    protected String chuanhoa(String s)
    {
        StringTokenizer ss = new StringTokenizer(s.toLowerCase());
        StringBuilder kq = new StringBuilder("");
        while(ss.hasMoreTokens())
        {
            StringBuilder token = new StringBuilder(ss.nextToken());
            kq.append(Character.toUpperCase(token.charAt(0)));
            for (int i =1; i < token.length();i++)
            {
                kq.append(token.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    protected long check(long x)
    {
        if(room.startsWith("1")) return 25*time+x;
        if(room.startsWith("2")) return 34*time+x;
        if(room.startsWith("3")) return 50*time+x;
        return 80*time+x;
    }
    @Override
    public String toString()
    {
        return code + " " + name + " " + room + " " + time + " " + money;
    }
    @Override
    public int compareTo(Client that)
    {
        return Long.compare(that.money, this.money);
    }
}
