import java.util.Scanner;

/**
 * Problem: Power of Two (01/10/2026 Homework, LeetCode #231)
 * 
 * Given an integer n, return true if it is a power of two. 
 * An integer n is a power of two if n > 0 and (n & (n - 1)) == 0.
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        boolean result = isPowerOfTwo(n);
        System.out.println(n + " is power of two? " + result);

        sc.close();
    }
}
