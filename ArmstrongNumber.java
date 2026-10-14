import java.util.Scanner;

/**
 * Problem: Armstrong Number Check (28/09/2026, GFG)
 * 
 * An Armstrong number is a number that is the sum of its own digits 
 * each raised to the power of the number of digits.
 * Example for 3 digits: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */
public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        if (n < 0) return false;

        int original = n;
        int numDigits = String.valueOf(n).length();
        long sum = 0;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (long) Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number (true)");
        } else {
            System.out.println(n + " is NOT an Armstrong number (false)");
        }

        sc.close();
    }
}
