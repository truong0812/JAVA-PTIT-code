DanhSachMonThi/Main.java
package DanhSachMonThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> list_monthi = new ArrayList<>();
        while(input.hasNextLine()) {
            int n = Integer.parseInt(input.nextLine());
            for(int i = 0; i < n; i++) {
                MonThi monthi = new MonThi(input.nextLine(), input.nextLine(), input.nextLine());
                list_monthi.add(monthi);
            }
        }
        Collections.sort(list_monthi);
        for(MonThi i : list_monthi) {
            System.out.println(i);
        }
    } 
}


public class MonThi implements Comparable<MonThi> {
    private String code, name, form;
    public MonThi() {
        code = "";
        name = "";
        form = "";
    }
    public MonThi(String code, String name, String form) {
        this.code = code;
        this.name = name;
        this.form = form;
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + form;
    }
    @Override
    public int compareTo(MonThi o) {
        return o.form.compareTo(this.form);
    }
}

