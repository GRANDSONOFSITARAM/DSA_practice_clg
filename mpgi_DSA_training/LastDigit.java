import java.util.Scanner;

/**
 * Problem: Last digit of a number (24/09/2026 Homework, GFG)
 * 
 * Given an integer n, find the last digit of the number.
 */
public class LastDigit {
    public static int getLastDigit(int n) {
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Last digit: " + getLastDigit(n));
        sc.close();
    }
}
