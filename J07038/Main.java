package J07038;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Student> hashStudent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            hashStudent.put(code, new Student(code, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("DN.in"));
        n = sc.nextInt();
        HashMap<String, Company> hashCompany = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String code = sc.nextLine();
            hashCompany.put(code, new Company(code, sc.nextLine(), sc.nextInt()));
        }
        sc = new Scanner(new File("THUCTAP.in"));
        n = sc.nextInt();
        ArrayList<ArrayList<String>> internship = new ArrayList<>();
        for (int i = 0; i < n; i++)
            internship.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            internship.get(i).add(sc.next());
            internship.get(i).add(sc.next());
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String companyCode = sc.next();
            ArrayList<DataInternship> res = new ArrayList<>();
            for (ArrayList<String> x : internship) {
                if (x.get(1).equals(companyCode))
                    res.add(new DataInternship(hashStudent.get(x.get(0))));
            }
            res.sort((x, y) -> {
                return x.intern.code.compareTo(y.intern.code);
            });
            int reception = Math.min(hashCompany.get(companyCode).numberOfReception, res.size());
            System.out.printf("DANH SACH THUC TAP TAI %s:\n", hashCompany.get(companyCode).name);
            for (int i = 0; i < reception; i++)
                System.out.println(res.get(i));
        }
    }
}
