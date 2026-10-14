import java.util.Scanner;

/**
 * Problem: Print 1 to N, N times (Square Number Pattern) (06/10/2026 - Q11.2)
 * 
 * Example (N = 5):
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
