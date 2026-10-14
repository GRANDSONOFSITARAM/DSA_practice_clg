import java.util.Scanner;

/**
 * Problem: Greatest Common Divisor Function (01/10/2026 - Q6)
 * 
 * Write a function that calculates the Greatest Common Divisor (GCD) of 2 numbers.
 */
public class GCDFunction {
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }
}
