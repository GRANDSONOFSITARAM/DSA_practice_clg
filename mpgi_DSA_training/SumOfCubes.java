import java.util.Scanner;

/**
 * Problem: Sum of first n terms / Sum of cubes (24/09/2026 Homework, GFG)
 * 
 * Given n, calculate the sum of series: 1^3 + 2^3 + 3^3 + ... + n^3
 * Mathematical formula: [n * (n + 1) / 2]^2
 */
public class SumOfCubes {
    public static long sumOfSeries(long n) {
        // Formula: (n * (n + 1) / 2)^2
        long sum = (n * (n + 1)) / 2;
        return sum * sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = sc.nextLong();

        System.out.println("Sum of cubes from 1 to " + n + ": " + sumOfSeries(n));
        sc.close();
    }
}
