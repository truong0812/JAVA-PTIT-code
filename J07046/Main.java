package J07046;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Client> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Client(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(set);
        for(Client x : set){
            System.out.println(x);
        }
    }
    
}

