package J05065;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<Employee> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String x = sc.nextLine();
            String[] s = x.split("\\s+");
            String code = s[0];
            String name = "";
            for(int j = 1; j < s.length; j++) {
                name += s[j] + " ";
            }
            String cmp = code.substring(0,2);
            if(map.containsKey(cmp)) {
                map.put(cmp, map.get(cmp) + 1);
            }
            else {
                map.put(cmp, 1);
            }
            Employee employee = new Employee(code, name.trim());
            if(cmp.equals("GD") && map.get(cmp) > 1) employee.setPosition();
            else if(cmp.equals("TP") && map.get(cmp) > 3) employee.setPosition();
            else if(cmp.equals("PP") && map.get(cmp) > 3) employee.setPosition();
            list.add(employee); 
        }
        ArrayList<String> a = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String q = sc.nextLine();
            a.add(q);
        }
        Collections.sort(list);
        for(String i : a) {
            for(Employee employee : list) {
                if(i.equals(employee.getPosition())) {
                    System.out.println(employee);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
