import java.util.Scanner;

/**
 * Problem: Print all the digits in the number (24/09/2026 - Q8)
 */
public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long temp = Math.abs(n);

        if (temp == 0) {
            System.out.println("Digits: 0");
            sc.close();
            return;
        }

        // Print from left to right
        String str = Long.toString(temp);
        System.out.println("Digits from left to right:");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // Print from right to left (using arithmetic)
        System.out.println("Digits from right to left (extracted using % 10):");
        while (temp > 0) {
            long digit = temp % 10;
            System.out.print(digit + " ");
            temp /= 10;
        }
        System.out.println();

        sc.close();
    }
}
