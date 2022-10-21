package J07018;

import java.io.*;
import java.text.ParseException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException, IOException, FileNotFoundException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Student student = new Student(i + 1, input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()));
            list.add(student);
        }
        // Collections.sort(list);
        for(Student student : list) {
            System.out.println(student);
        }
        input.close();
    }
}
