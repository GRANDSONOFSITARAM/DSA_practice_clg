import java.util.Scanner;

/**
 * Problem: GCD of two numbers (29/09/2026, GFG)
 * 
 * Given two numbers A and B, find their Greatest Common Divisor (GCD)
 * using the Euclidean Algorithm.
 */
public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        sc.close();
    }
}
