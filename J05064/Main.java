package J05064;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Teacher> list = new ArrayList<>();
        int ht = 1, hp = 2;
        for(int i = 0; i < n; i++) {
            String id = input.nextLine();
            if(id.substring(0,2).equals("HT")) ht--;
            if(id.substring(0,2).equals("HP")) hp--;
            String name = input.nextLine();
            long basic_salary = Long.parseLong(input.nextLine());
            if(ht < 0 && id.substring(0,2).equals("HT")) continue;
            if(hp < 0 && id.substring(0,2).equals("HP")) continue;
            Teacher teacher = new Teacher(id, name, basic_salary);
            list.add(teacher);
        }
        for(Teacher teacher : list) {
            System.out.println(teacher);
        }
        input.close();
    }
}
