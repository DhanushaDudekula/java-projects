package dhanu;
import java.util.Comparator;
import java.util.TreeSet;

public class Main9 {
    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator for reverse order
        TreeSet<String> employeeNames = new TreeSet<>(Comparator.reverseOrder());

        // Add employee names
        employeeNames.add("Sumit");
        employeeNames.add("Karan");
        employeeNames.add("Anjali");
        employeeNames.add("Mohan");
        employeeNames.add("Zoya");

        // Display the names in reverse order
        System.out.println("Employee names in reverse order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
