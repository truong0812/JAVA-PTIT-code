package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        while(n-->0) dsSV.add(new SinhVien(sc));
        sc.nextLine();
        ArrayList<Nhom> dsN = new ArrayList<>();
        int stt = 1;
        while(m-->0) dsN.add(new Nhom(sc.nextLine(),dsSV,stt++));
        Collections.sort(dsSV);
        for(SinhVien tmp : dsSV)
            System.out.println(tmp);
    }
}
