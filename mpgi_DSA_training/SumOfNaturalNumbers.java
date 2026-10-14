import java.util.Scanner;

/**
 * Problem: Sum of all n natural numbers (24/09/2026 - Q5)
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        // Formula check: n * (n + 1) / 2
        sc.close();
    }
}
