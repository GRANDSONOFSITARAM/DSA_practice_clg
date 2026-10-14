import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem: Sieve of Eratosthenes (13/10/2026)
 * 
 * An ancient and highly efficient algorithm for finding all prime numbers 
 * up to any given limit n.
 * Time Complexity: O(n * log(log(n)))
 * Space Complexity: O(n)
 */
public class SieveOfEratosthenes {
    public static void sieve(int n) {
        if (n < 2) {
            System.out.println("No primes in range.");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime starting from p*p
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("All prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes found: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit n: ");
        int n = sc.nextInt();

        sieve(n);
        sc.close();
    }
}
