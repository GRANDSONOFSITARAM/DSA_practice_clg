import java.util.Scanner;

/**
 * Problem: Sum of all odd numbers from 1 to n (01/10/2026 - Q2)
 * 
 * Write a function to print the sum of all odd numbers from 1 to n.
 */
public class SumOfOddNumbers {
    public static void printSumOfOdd(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printSumOfOdd(n);
        sc.close();
    }
}
