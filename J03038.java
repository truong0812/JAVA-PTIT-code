import java.util.*;

public class J03038 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = sc.next();
        HashSet<String> mySet = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println(mySet.size());
    }
}