package J07056;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList <KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            String loai = sc.next();
            int chiSoDau = sc.nextInt();
            int chiSoCuoi = sc.nextInt();
            KhachHang kh = new KhachHang(hoTen, loai, chiSoDau, chiSoCuoi);
            kh.chuanHoaTen();
            list.add(kh);
        }
        Collections.sort(list, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o2.tongTien() - o1.tongTien();
            }
            
        });
        for(KhachHang x : list){
            System.out.println(x);
        }
        
    }
}
