import java.util.Scanner;

/**
 * Problem: Alphabet Pattern 2 - Inverted Alphabet Triangle (13/10/2026 Homework - Q2)
 * 
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 */
public class AlphabetPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (default 5): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;

        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
