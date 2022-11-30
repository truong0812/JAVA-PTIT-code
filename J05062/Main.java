package J05062;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] y = x.split("\\s+");
        int n = Integer.parseInt(y[0]);
        int m = Integer.parseInt(y[1]);
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String a = sc.nextLine();
            String[] b = a.split("\\s+");
            double tbc = Double.parseDouble(b[0]);
            double rl = Double.parseDouble(b[1]);
            Student student = new Student(name, tbc, rl);
            list.add(student);
            res.add(student);
        }
        Collections.sort(list);
        double cmp = list.get(m - 1).getTbc();
        for(Student student : res) {
            if(student.getTbc() < cmp) {
                student.setKq();
            }
            System.out.println(student);
        }
        sc.close();
    }
}
