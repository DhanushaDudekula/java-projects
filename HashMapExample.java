package hello;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("dhanu", 20);
        scores.put("roja",40);
        scores.put("giri", 45);

        System.out.println(scores);
    }
}
