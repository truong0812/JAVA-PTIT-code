import java.io.*;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        while(scan.hasNext()){
            String s= scan.nextLine();
            System.out.println(s);
        }
    }
}