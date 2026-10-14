import java.util.Scanner;

/**
 * Problem: Power Function x^n (01/10/2026 - Q5)
 * 
 * Two numbers are entered by the user, x and n. 
 * Write a function to find the value of one number raised to the power of another i.e. x^n.
 */
public class PowerFunction {
    public static double power(double x, int n) {
        if (n == 0) return 1.0;

        long exp = n;
        if (exp < 0) {
            x = 1.0 / x;
            exp = -exp;
        }

        double result = 1.0;
        double currentProduct = x;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            exp >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double ans = power(x, n);
        System.out.println(x + " ^ " + n + " = " + ans);

        sc.close();
    }
}
