import java.util.Scanner;

/**
 * Problem: Print n to 1 natural numbers (24/09/2026 - Q2)
 */
public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
