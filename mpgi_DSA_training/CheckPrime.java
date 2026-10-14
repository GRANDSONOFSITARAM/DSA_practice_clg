import java.util.Scanner;

/**
 * Problem: Prime Number Check (28/09/2026, GFG)
 * 
 * Given a number n, determine if it is prime.
 * A prime number is only divisible by 1 and itself.
 */
public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number (true / 1)");
        } else {
            System.out.println(n + " is NOT a Prime Number (false / 0)");
        }

        sc.close();
    }
}
