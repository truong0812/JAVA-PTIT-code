package J05079;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Hocphan> hocphans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Hocphan hocphan = new Hocphan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            hocphans.add(hocphan);
        }
        Collections.sort(hocphans);
        int m = sc.nextInt();
        ArrayList<String> tmp = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String s = sc.next();
            tmp.add(s);
        }
        for(String s : tmp) {
            for(Hocphan hocphan : hocphans) {
                if(hocphan.getCode().equals(s)) {
                    System.out.println("Danh sach nhom lop mon " + hocphan.getName() + ":");
                    break;
                }
            }
            for(Hocphan hocphan : hocphans) {
                if(hocphan.getCode().equals(s)) {
                    System.out.println(hocphan);
                }
            }
        }
        sc.close();
    }
}
