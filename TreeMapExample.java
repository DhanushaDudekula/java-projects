package hello;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 78);
        marks.put("Charlie", 92);

        System.out.println("Student Marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + " - " + marks.get(name));
        }

        String search = "Bob";
        if (marks.containsKey(search)) {
            System.out.println(search + "'s marks: " + marks.get(search));
        } else {
            System.out.println(search + " not found.");
        }

        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Alice", "9876543210");
        phoneBook.put("Bob", "9123456789");

        System.out.println("Phone Book:");
        for (String name : phoneBook.keySet()) {
            System.out.println(name + " - " + phoneBook.get(name));
        }
    }
}