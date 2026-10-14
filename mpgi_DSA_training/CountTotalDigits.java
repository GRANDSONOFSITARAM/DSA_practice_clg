import java.util.Scanner;

/**
 * Problem: Count total digits in a number (29/09/2026, GFG)
 * 
 * You are given a number n. You need to find the count of digits in n.
 * Commonly implemented using recursion.
 */
public class CountTotalDigits {
    // Recursive approach
    public static int countDigitsRecursive(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return 1 + countDigitsRecursive(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.println("Total digits: " + countDigitsRecursive(Math.abs(n)));
        sc.close();
    }
}
