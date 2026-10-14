import java.util.Scanner;

/**
 * Problem: Find sum of all even and odd numbers from 1 to n using a single loop (24/09/2026 - Q6)
 */
public class SumEvenOddSingleLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long evenSum = 0;
        long oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers (1 to " + n + "): " + evenSum);
        System.out.println("Sum of odd numbers (1 to " + n + "): " + oddSum);

        sc.close();
    }
}
