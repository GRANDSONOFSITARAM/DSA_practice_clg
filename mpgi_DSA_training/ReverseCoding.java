import java.util.Scanner;

/**
 * Problem: Reverse Coding (24/09/2026 Homework, GFG)
 * 
 * Given n and m, check if m is equal to sum of first n natural numbers,
 * i.e., m == n * (n + 1) / 2.
 * Returns 1 if valid, 0 otherwise.
 */
public class ReverseCoding {
    public static int revCoding(int n, int m) {
        int expected = (n * (n + 1)) / 2;
        return (expected == m) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int result = revCoding(n, m);
        System.out.println("Result (1 if m == n*(n+1)/2 else 0): " + result);

        sc.close();
    }
}
