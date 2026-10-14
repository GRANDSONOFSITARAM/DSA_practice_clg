import java.util.Scanner;

/**
 * Problem: Print N "*", N times (Square Star Pattern) (06/10/2026 - Q11.1)
 * 
 * Example (N = 4):
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
