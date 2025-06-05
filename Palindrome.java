package hello;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt(), r = 0, temp = n;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        System.out.println(temp == r ? "Palindrome" : "Not a palindrome");
        s.close();
    }
}