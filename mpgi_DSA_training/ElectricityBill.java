import java.util.Scanner;

/**
 * Problem: Electricity Bill Calculation (22/09/2026 - Q1)
 * 
 * Rates:
 * 0 - 100 units    : Rs. 5 per unit
 * 101 - 200 units  : Rs. 7 per unit
 * 201 - 300 units  : Rs. 10 per unit
 * Above 300 units  : Rs. 12 per unit
 * 
 * Note: The applicable rate is applied to all consumed units.
 */
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        int rate;
        if (units <= 100) {
            rate = 5;
        } else if (units <= 200) {
            rate = 7;
        } else if (units <= 300) {
            rate = 10;
        } else {
            rate = 12;
        }

        int totalBill = units * rate;
        System.out.println("Electricity Bill: ₹" + totalBill);

        sc.close();
    }
}
