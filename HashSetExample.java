package hello;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will be ignored

        System.out.println(colors);
    }
}