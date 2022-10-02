package DanhSachMonThi;

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
        return this.code.compareTo(o.code);
    }
}
