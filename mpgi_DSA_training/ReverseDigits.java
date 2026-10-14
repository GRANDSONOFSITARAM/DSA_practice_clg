import java.util.Scanner;

/**
 * Problem: Reverse digits of a number (29/09/2026, GFG)
 * 
 * Given N, reverse the digits of N.
 * Example: 200 -> 2, 122 -> 221
 */
public class ReverseDigits {
    public static long reverseDigits(long n) {
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long n = sc.nextLong();

        System.out.println("Reversed number: " + reverseDigits(n));
        sc.close();
    }
}
