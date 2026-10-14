import java.util.Scanner;

/**
 * Problem: Alphabet Pattern 1 (13/10/2026 Homework - Q1)
 * 
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */
public class AlphabetPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
