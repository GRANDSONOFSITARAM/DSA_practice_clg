import java.util.Scanner;

/**
 * Problem: Odd or Even (24/09/2026 - Q12, GFG)
 * 
 * Given an integer n, check whether it is odd or even.
 */
public class OddOrEven {
    public static boolean isEven(int n) {
        // Can be checked using n % 2 == 0 or bitwise (n & 1) == 0
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        sc.close();
    }
}
