import java.util.Scanner;

/**
 * Problem: Rotate Digits of a Number by K (29/09/2026 - Q4)
 * 
 * If K is positive, left rotate digits by K.
 * If K is negative, right rotate digits by |K|.
 * 
 * Example 1: N = 12345, K = 2  -> Output: 34512
 * Example 2: N = 12345, K = -3 -> Output: 34512
 */
public class RotateDigits {
    public static long rotateDigits(long n, int k) {
        String s = Long.toString(n);
        int len = s.length();
        if (len <= 1) return n;

        k = k % len;
        if (k < 0) {
            k += len; // Convert right rotation to equivalent left rotation
        }

        String rotated = s.substring(k) + s.substring(0, k);
        return Long.parseLong(rotated);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        long n = sc.nextLong();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        long ans = rotateDigits(n, k);
        System.out.println("Result: " + ans);

        sc.close();
    }
}
