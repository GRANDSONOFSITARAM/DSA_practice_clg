import java.util.Scanner;

/**
 * Problem: Check if a number is power of another number (28/09/2026 Homework, GFG)
 * 
 * Given two numbers X and Y, check if Y is a power of X (X^k = Y).
 * Return 1 if true, 0 if false.
 */
public class CheckPower {
    public static int isPowerOfAnother(long x, long y) {
        if (x == 1) {
            return (y == 1) ? 1 : 0;
        }

        long power = 1;
        while (power < y) {
            power *= x;
        }

        return (power == y) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        long x = sc.nextLong();
        System.out.print("Enter Y: ");
        long y = sc.nextLong();

        int result = isPowerOfAnother(x, y);
        if (result == 1) {
            System.out.println(y + " is a power of " + x + " (Result: 1)");
        } else {
            System.out.println(y + " is NOT a power of " + x + " (Result: 0)");
        }

        sc.close();
    }
}
