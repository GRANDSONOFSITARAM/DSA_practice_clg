import java.util.Scanner;

/**
 * Problem: Count all the digits in the number (24/09/2026 - Q9)
 */
public class CountDigits {
    public static int countDigits(long n) {
        n = Math.abs(n);
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        System.out.println("Total number of digits: " + countDigits(n));
        sc.close();
    }
}
