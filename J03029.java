import java.util.*;

public class J03029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
        {
            String s = in.nextLine();
            System.out.println(chuanhoa(s));
        }
    }
    public static String chuanhoa(String source)
    {
        source = source.trim();
        source = source.replaceAll("\\s+", " ");
        source = source.replaceAll("\\s+([.!?])", "$1");
        source = source.toLowerCase();
        source = source.substring(0, 1).toUpperCase() + source.substring(1);
        if (Character.isAlphabetic(source.charAt(source.length() - 1))) {
            source += '.';
        }
        return source;
    }
}
