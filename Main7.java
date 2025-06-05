package dhanu;
import java.util.Arrays;
import java.util.Scanner;

public class Main7{
    public static void main(String[] args) {
        // Sorted array of names
        String[] names = { "amit", "divya", "karan", "priya", "zoya" };

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String inputName = scanner.nextLine().toLowerCase(); // make search case-insensitive

        // Perform binary search
        int result = Arrays.binarySearch(names, inputName);

        // Check result
        if (result >= 0) {
            System.out.println("Name \"" + inputName + "\" found at index " + result + ".");
        } else {
            System.out.println("Name \"" + inputName + "\" not found.");
        }

        scanner.close();
    }
}
