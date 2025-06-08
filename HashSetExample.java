package hello;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("yellow");
        colors.add("Gray");
        colors.add("Black");
        colors.add("Black"); // Duplicate, will be ignored

        System.out.println(colors);
    }
}
