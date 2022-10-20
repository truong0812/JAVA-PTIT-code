package J05078;

import java.util.ArrayList;

public class NhanVien {
    private PhongBan phongBan;
    private String code, ten, loai, ma;
    private int luong_ngay, ngay_cong, luong_thang, he_so, tham_nien;
    public NhanVien(){}
    public NhanVien(String code, String ten, int luong_ngay, int ngay_cong, ArrayList<PhongBan> list) {
        this.code = code;
        this.ten = ten;
        this.luong_ngay = luong_ngay;
        this.ngay_cong = ngay_cong;
        this.loai = code.substring(0, 1);
        this.tham_nien = Integer.parseInt(code.substring(1, 3));
        this.ma = code.substring(3);
        this.he_so = solveHe_so();
        this.luong_thang = luong_ngay*ngay_cong*he_so*1000;
        this.phongBan = solvePhongBan(list);
    }
    private PhongBan solvePhongBan(ArrayList<PhongBan> list) {
        int x = 0;
        for(int  i = 0; i < list.size(); i++) {
            if(ma.equals(list.get(i).getMa())) {
                x = i;
                break;
            }
        }
        return list.get(x);
    }
    private int solveLoaiA() {
        int ans;
        if(tham_nien <= 3) ans = 10;
        else if(tham_nien <= 8) ans = 12;
        else if(tham_nien <= 15) ans = 14;
        else ans = 20;
        return ans;  
    }
    private int solveLoaiB() {
        int ans;
        if(tham_nien <= 3) ans = 10;
        else if(tham_nien <= 8) ans = 11;
        else if(tham_nien <= 15) ans = 13;
        else ans = 16;
        return ans;  
    }
    private int solveLoaiC() {
        int ans;
        if(tham_nien <= 3) ans = 9;
        else if(tham_nien <= 8) ans = 10;
        else if(tham_nien <= 15) ans = 12;
        else ans = 14;
        return ans;  
    }
    private int solveLoaiD() {
        int ans;
        if(tham_nien <= 3) ans = 8;
        else if(tham_nien <= 8) ans = 9;
        else if(tham_nien <= 15) ans = 11;
        else ans = 13;
        return ans;  
    }
    private int solveHe_so() {
        int ans;
        if(loai.equals("A")) ans = solveLoaiA();
        else if(loai.equals("B")) ans = solveLoaiB();
        else if(loai.equals("C")) ans = solveLoaiC();
        else ans = solveLoaiD();
        return ans;
    }
    public String getMa() {
        return ma;
    }
    @Override
    public String toString() {
        return code + " " + ten + " " + luong_thang;
    }
}
