package hello;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet to store unique numbers in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate, will be ignored

        System.out.println("Sorted Unique Numbers: " + numbers);

        // Search for a value
        int searchValue = 30;
        if (numbers.contains(searchValue)) {
            System.out.println("Found number: " + searchValue);
        } else {
            System.out.println("Number not found: " + searchValue);
        }

        // TreeSet to store student names in alphabetical order
        TreeSet<String> studentNames = new TreeSet<>();
        studentNames.add("Zara");
        studentNames.add("John");
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Alice"); // duplicate, will be ignored

        System.out.println("Student Names (Alphabetical Order): " + studentNames);
    }
}
