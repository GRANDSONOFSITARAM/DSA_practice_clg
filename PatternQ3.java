import java.util.Scanner;

/**
 * Problem: Pattern Q3 (08/10/2026)
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class PatternQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
