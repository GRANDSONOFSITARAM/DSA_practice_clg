import java.util.Scanner;

/**
 * Problem: Print 1 to n natural numbers (24/09/2026 - Q1)
 */
public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
