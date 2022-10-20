package J05076;

import java.util.*;

public class ThongKe {
    private MatHang matHang;
    private String ma;
    private int nhap, gia, xuat, tien_nhap, tien_xuat;
    public ThongKe(){}
    public ThongKe(String ma, int nhap, int gia, int xuat, ArrayList<MatHang> list) {
        this.ma = ma;
        this.nhap = nhap;
        this.gia = gia;
        this.xuat = xuat;
        this.matHang = solveMatHang(list);
        this.tien_nhap = nhap*gia;
        this.tien_xuat = solveTien_xuat();
    }

    private MatHang solveMatHang(ArrayList<MatHang> list) {
        int x = 0;
        for(int i = 0; i < list.size(); i++) {
            if(ma.equals(list.get(i).getMa())) {
                x = i;
                break;
            }
        }
        return list.get(x);
    }
    private int solveTien_xuat() {
        int tmp = xuat*gia;
        int lai;
        if(matHang.getLoai().equals("A")) lai = tmp*2/25;
        else if (matHang.getLoai().equals("B")) lai = tmp/20;
        else lai = tmp/50;
        int ans = tmp + lai;
        return ans;
    }
    @Override
    public String toString() {
        return ma + " " + matHang.getTen() + " " + tien_nhap + " " + tien_xuat;
    } 
}
