import java.util.Scanner;

/**
 * Problem: Count Squares (24/09/2026 Homework, GFG)
 * 
 * Given N, find the count of perfect squares strictly less than N.
 * Formula: floor(sqrt(N - 1))
 */
public class CountSquares {
    public static int countSquares(int n) {
        if (n <= 1) return 0;
        return (int) Math.sqrt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Number of perfect squares strictly less than " + n + ": " + countSquares(n));
        sc.close();
    }
}
