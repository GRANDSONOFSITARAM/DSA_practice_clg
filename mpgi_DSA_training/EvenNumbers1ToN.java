import java.util.Scanner;

/**
 * Problem: Print all even numbers from 1 to n (24/09/2026 - Q3)
 */
public class EvenNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
