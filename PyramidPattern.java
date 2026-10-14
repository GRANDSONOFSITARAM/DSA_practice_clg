import java.util.Scanner;

/**
 * Problem: Pyramid Star Pattern (12/10/2026 - Q1)
 * 
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * *
 */
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars (2 * i - 1)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
