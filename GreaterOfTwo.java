import java.util.Scanner;

/**
 * Problem: Greater of Two Numbers (01/10/2026 - Q3)
 * 
 * Write a function which takes in 2 numbers and returns the greater of those two.
 */
public class GreaterOfTwo {
    public static double getGreater(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double max = getGreater(a, b);
        System.out.println("The greater number is: " + max);

        sc.close();
    }
}
