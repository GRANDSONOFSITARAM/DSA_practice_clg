import java.util.Scanner;

/**
 * Problem: Sum of all digits present in the number (24/09/2026 - Q10)
 */
public class SumOfDigits {
    public static int sumOfDigits(long n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        System.out.println("Sum of digits: " + sumOfDigits(n));
        sc.close();
    }
}
