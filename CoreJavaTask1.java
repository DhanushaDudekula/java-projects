package hello;

import java.util.Scanner;

public class CoreJavaTask1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println(n + " " + (n % 2 == 0 ? "is even." : "is odd."));
        s.close();
    }
}