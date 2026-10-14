import java.util.Scanner;

/**
 * Problem: ATM Withdrawal System (22/09/2026 - Q2)
 * 
 * Check withdrawal conditions:
 * - amount <= 0: Invalid withdrawal amount
 * - amount > balance: Insufficient balance
 * - otherwise: Allow withdrawal and show details
 */
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Withdrawn Amount: " + withdrawalAmount);
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}
