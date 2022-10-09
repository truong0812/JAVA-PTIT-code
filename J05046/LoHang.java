package J05046;

import java.util.*;

public class LoHang {
    private String maHang, tenHang;
    private int soLuong, donGia;
    private static Map <String, Integer> map;
    
    public static void initMap(){
        LoHang.map = new TreeMap<>();
    }
    public LoHang(String tenHang, int soLuong, int donGia) {
        String[] arr = tenHang.trim().split("\\s+");
        String tmp = "" + Character.toUpperCase(arr[0].charAt(0)) + Character.toUpperCase(arr[1].charAt(0));
        if(map.containsKey(tmp)){
            int d = map.get(tmp);
            this.maHang = tmp + String.format("%02d", ++d);
            map.put(tmp, d);
        }
        else{
            this.maHang = tmp + String.format("%02d", 1);
            map.put(tmp, 1);
        }
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public float phanTramChietKhau(){
        if(this.soLuong > 10) return 0.05f;
        if(this.soLuong > 7) return 0.02f;
        if(this.soLuong > 4) return 0.01f;
        return 0;
    }
    public int tienChietKhau(){
        return (int) (this.donGia * this.soLuong * this.phanTramChietKhau());
    }
    public int thanhTien(){
        return this.donGia * this.soLuong - this.tienChietKhau();
    }
    
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.tienChietKhau() + " " + this.thanhTien();
    }
}
