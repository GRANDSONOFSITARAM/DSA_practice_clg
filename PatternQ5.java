import java.util.Scanner;

/**
 * Problem: Pattern Q5 (08/10/2026)
 * 
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
public class PatternQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
