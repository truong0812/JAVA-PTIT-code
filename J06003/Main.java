package J06003;

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
        int t = sc.nextInt();
        while(t-->0){
            int sttNhom = sc.nextInt();
            for(Nhom tmp : dsN)
                if(tmp.getsttnhom() == sttNhom)
                    System.out.println(tmp);
        }
    }
}
