import java.util.Scanner;

/**
 * Problem: Pattern Q6 - Floyd's Triangle (08/10/2026)
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class PatternQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}
