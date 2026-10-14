import java.util.Scanner;

/**
 * Problem: Arithmetic Operators (24/09/2026 Homework, GFG)
 * 
 * Given two integers p and q, perform basic arithmetic operations:
 * addition, subtraction, multiplication, division, and modulo.
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (p): ");
        int p = sc.nextInt();
        System.out.print("Enter second number (q): ");
        int q = sc.nextInt();

        System.out.println("p + q = " + (p + q));
        System.out.println("p - q = " + (p - q));
        System.out.println("p * q = " + (p * q));

        if (q != 0) {
            System.out.println("p / q = " + (p / q));
            System.out.println("p % q = " + (p % q));
        } else {
            System.out.println("Division and modulo by zero are undefined.");
        }

        sc.close();
    }
}
