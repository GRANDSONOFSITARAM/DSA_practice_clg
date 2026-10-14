import java.util.Scanner;

/**
 * Problem: Pattern Q9 - Inverted Repeated Number Triangle (08/10/2026)
 * 
 * 5 5 5 5 5
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 */
public class PatternQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
