package hello;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] numbers = {6, 18, 1, 90, 32, 56}; // array to search
        int target = 48;                     // value to find
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found");
        }
    }
}0
