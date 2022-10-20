package J05077;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> phongBans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String tmp = "";
            for(int j = 1; j < x.length; j++) {
                tmp += x[j] + " ";
            }
            PhongBan phongBan = new PhongBan(x[0], tmp.trim());
            phongBans.add(phongBan);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            NhanVien nhanVien = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), phongBans);
            list.add(nhanVien);
        }
        for(NhanVien nhanVien : list) {
            System.out.println(nhanVien);
        }
        sc.close();
    }
}
