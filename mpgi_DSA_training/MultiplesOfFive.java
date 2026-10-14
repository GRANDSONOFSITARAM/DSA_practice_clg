import java.util.Scanner;

/**
 * Problem: Print all multiples of 5 from 1 to n (24/09/2026 - Q4)
 */
public class MultiplesOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Multiples of 5 from 1 to " + n + ":");
        for (int i = 5; i <= n; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
