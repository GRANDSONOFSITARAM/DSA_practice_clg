import java.util.Scanner;

/**
 * Problem: Palindrome Number Check (24/09/2026 & 01/10/2026 Homework, GFG)
 * 
 * Check whether a given number reads the same forwards and backwards.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is NOT a Palindrome");
        }

        sc.close();
    }
}
