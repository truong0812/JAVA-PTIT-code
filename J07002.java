import java.io.*;
import java.util.Scanner;

public class J07002 {
    public static boolean Ktra(String s){
        long x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'9'||s.charAt(i)<'0')return false;
            x=x*10 + Integer.valueOf(s.charAt(i));
            if(x>2000000000)return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        long res=0;
        while(scan.hasNext()){
            String s=scan.next();
            if(Ktra(s))res+=Integer.parseInt(s);
        }
        System.out.println(res);
    }
}