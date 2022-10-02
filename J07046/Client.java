package J07046;


import java.util.*;
import java.util.concurrent.TimeUnit;

class Client implements Comparable<Client>{
    static int id = 0;
    private String code = "KH", fullName, roomCode;
    private long totalDays;
    private Date comeDate, outDate;
    public Client(String fullName, String roomCode, Date comeDate, Date outDate){
        id += 1;
        this.code += String.format("%02d", id);
        this.fullName = fullName;
        this.roomCode = roomCode;
        this.comeDate = comeDate;
        this.outDate = outDate;
    }
    //
    protected long getDay(){
        this.totalDays = this.outDate.getTime() - this.comeDate.getTime();
        return TimeUnit.DAYS.convert(totalDays, TimeUnit.MILLISECONDS);
    }
    //
    @Override
    public int compareTo(Client t){
        return Long.compare(t.getDay(), this.getDay());
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.fullName + " " + this.roomCode + " " + this.getDay();
    }
}
