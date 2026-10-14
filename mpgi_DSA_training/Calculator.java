import java.util.Scanner;

/**
 * Problem: Calculator Application (06/10/2026 - Q10)
 * 
 * An interactive console calculator performing basic arithmetic operations:
 * Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulo (%),
 * and Exponentiation (^).
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("=== Calculator Application ===");

        while (continueCalc) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Exit");
            System.out.print("Enter choice (1-7): ");

            int choice = sc.nextInt();
            if (choice == 7) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        valid = false;
                    } else {
                        result = num1 % num2;
                        System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    }
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-7.");
                    valid = false;
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch != 'y') {
                continueCalc = false;
                System.out.println("Thank you for using the Calculator!");
            }
        }

        sc.close();
    }
}
