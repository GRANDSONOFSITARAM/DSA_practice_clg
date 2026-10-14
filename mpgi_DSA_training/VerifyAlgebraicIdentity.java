import java.util.Scanner;

/**
 * Problem: Verify Algebraic Identity (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2 (24/09/2026 - Q11)
 * 
 * Takes two positive integers a and b from the user.
 * Calculates LHS and RHS.
 * Prints LHS and RHS.
 * Prints VERIFIED if equal, else NOT VERIFIED.
 */
public class VerifyAlgebraicIdentity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first positive integer (a): ");
        long a = sc.nextLong();

        System.out.print("Enter second positive integer (b): ");
        long b = sc.nextLong();

        long lhs = (a + b) * (a + b) * (a + b);
        long rhs = (a * a * a) + (b * b * b) + (3 * a * a * b) + (3 * a * b * b);

        System.out.println("LHS = " + lhs);
        System.out.println("RHS = " + rhs);

        if (lhs == rhs) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }

        sc.close();
    }
}
