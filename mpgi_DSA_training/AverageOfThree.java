import java.util.Scanner;

/**
 * Problem: Average of Three Numbers (01/10/2026 - Q1)
 * 
 * Enter 3 numbers from the user and make a function to print their average.
 */
public class AverageOfThree {
    public static void printAverage(double a, double b, double c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average of " + a + ", " + b + ", and " + c + " is: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        printAverage(num1, num2, num3);
        sc.close();
    }
}
