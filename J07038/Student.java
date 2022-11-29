package J07038;

import java.util.*;

public class Student {
    public String code, name, className, email;

    public Student(String code, String name, String className, String email) {
        this.code = code;
        this.name = getFormattedName(name);
        this.className = className;
        this.email = email;
    }

    public String getFormattedName(String nm) {
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(nm.trim().toLowerCase().split("\\s+")));
        StringBuilder formattedName = new StringBuilder("");
        for (int i = 0; i < tmp.size(); i++) {
            StringBuilder w = new StringBuilder(tmp.get(i));
            w.setCharAt(0, Character.toUpperCase(w.charAt(0)));
            formattedName.append(w + " ");
        }
        return formattedName.toString().trim();
    }
}

