package J05055;


import java.util.*;


import java.util.*;
import java.text.*;

public class VanDongVien implements Comparable<VanDongVien>{
    private String code, name, dob, tttt, uu_tien, ttxh; ;
    private Date start, end;
    private int rank;
    public VanDongVien(int n, String name, String dob, String start, String end) throws ParseException {
        this.code = "VDV" + String.format("%02d", n);
        this.name = name;
        this.dob = dob;
        this.start = new SimpleDateFormat("hh:mm:ss").parse(start);
        this.end = new SimpleDateFormat("hh:mm:ss").parse(end);
        this.tttt = solveTttt();
        this.uu_tien = solveUu_tien();
        this.ttxh = solveTtxh();
    }
    private String solveTttt() {
        long tmp = (end.getTime() - start.getTime())/1000;
        long hh = tmp/3600;
        long mm = tmp%3600;
        mm = mm/60;
        long ss = tmp%3600;
        ss = ss%60;
        String cmp = String.format("%02d:%02d:%02d", hh, mm, ss);
        return cmp;
    }
    private String solveUu_tien(){
        int cmp = 2021 - Integer.parseInt(dob.substring(6));
        String tmp;
        if(cmp < 18) tmp = "00:00:00";
        else if(cmp < 25) tmp = "00:00:01";
        else if(cmp < 32) tmp = "00:00:02";
        else tmp = "00:00:03";
        return tmp;
    }
    private String solveTtxh() throws ParseException {
        Date a = new SimpleDateFormat("hh:mm:ss").parse(tttt);
        Date b = new SimpleDateFormat("hh:mm:ss").parse(uu_tien);
        long tmp = (a.getTime() - b.getTime()) / 1000;
        long hh = tmp/3600;
        long mm = tmp%3600;
        mm = mm/60;
        long ss = tmp%3600;
        ss = ss%60;
        String cmp = String.format("%02d:%02d:%02d", hh, mm, ss);
        return cmp;
    }
    public void setRank(int i) {
        this.rank = i;
    }
    public String getCode() {
        return code;
    }
    public String getTtxh() {
        return ttxh;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + tttt + " " + uu_tien + " " + ttxh + " " + rank;
    }
    @Override
    public int compareTo(VanDongVien o) {
        return this.ttxh.compareTo(o.ttxh);
    }
}