package hello;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet to store unique numbers in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(41);
        numbers.add(11);
        numbers.add(33);
        numbers.add(42);
        numbers.add(31); // duplicate, will be ignored

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
        studentNames.add("Zainab");
        studentNames.add("Johny");
        studentNames.add("Arun");
        studentNames.add("Bobby");
        studentNames.add("Arun"); // duplicate, will be ignored

        System.out.println("Student Names (Alphabetical Order): " + studentNames);
    }
}
