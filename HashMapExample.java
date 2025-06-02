package hello;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        System.out.println(scores);
    }
}