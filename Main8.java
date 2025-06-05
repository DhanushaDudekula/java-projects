package dhanu;
import java.util.Scanner;

public class Main8{
    public static void main(String[] args) {
        // Input number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        // Binary search for square root
        int start = 0, end = n, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                ans = mid;         // store possible answer
                start = mid + 1;   // search in right half
            } else {
                end = mid - 1;     // search in left half
            }
        }

        System.out.println("Square root (integer part) of " + n + " is: " + ans);
    }
}