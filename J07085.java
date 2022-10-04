import java.util.*;
import java.io.*;;
public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) is.readObject();
        for(String tmp : a){
            tmp = tmp.toUpperCase();
            for(char i = 'A';i<='Z';i++)
                tmp = tmp.replace(i+"", "");
            while(tmp.startsWith("0")) tmp = tmp.substring(1);
            int sum = 0;
            for(int i=0; i<tmp.length();i++)
                sum += tmp.charAt(i) - '0';
            System.out.println(tmp+" "+sum);
        }
    }
}