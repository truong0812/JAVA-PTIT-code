import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = new ArrayList<>();
        list = (ArrayList<String>) ois.readObject();
        ois.close();
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        for (String i : list) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(words));
        }
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (set.contains(s)) {
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}

