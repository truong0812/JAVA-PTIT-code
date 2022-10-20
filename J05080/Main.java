package J05080;

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
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<String> tmp = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String s = sc.nextLine();
            tmp.add(s);
        }
        for(String s : tmp) {
            for(Hocphan hocphan : hocphans) {
                if(hocphan.getTeacher().equals(s)) {
                    System.out.println("Danh sach cho giang vien " + hocphan.getTeacher() + ":");
                    break;
                }
            }
            for(Hocphan hocphan : hocphans) {
                if(hocphan.getTeacher().equals(s)) {
                    System.out.println(hocphan);
                }
            }
        }
        sc.close();
    }
}
