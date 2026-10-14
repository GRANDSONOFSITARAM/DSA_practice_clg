import java.util.Scanner;

/**
 * Problem: Pattern Q2 (08/10/2026)
 * 
 *  1  2  3  4  5
 *  6  7  8  9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 */
public class PatternQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", count++);
            }
            System.out.println();
        }

        sc.close();
    }
}
