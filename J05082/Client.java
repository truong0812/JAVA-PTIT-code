package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client implements Comparable<Client> {
    private String code, name, sex, address;
    private Date dob;
    public Client() {}
    public Client(int n, String name, String sex, String dob, String address) throws ParseException {
        this.code = "KH" + String.format("%03d", n);
        this.name = chuanHoa(name);
        this.sex = sex;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
    }
    private String chuanHoa(String s) {
        String[] S = s.trim().split("\\s+");
        String tmp = "";
        for(String i : S) {
            tmp += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return tmp.trim();
    }
    @Override 
    public String toString(){
        return code + " " + name + " " + sex + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob);
    }
    @Override
    public int compareTo(Client o) {
        return this.dob.compareTo(o.dob);
    }
}
