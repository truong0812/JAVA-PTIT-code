package J05082;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Client> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Client client = new Client(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(client);
        }
        Collections.sort(list);
        for(Client client : list) {
            System.out.println(client);
        }
        sc.close();
    }
}
