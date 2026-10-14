import java.util.Scanner;

/**
 * Problem: Leap Year (24/09/2026 Homework, GFG)
 * 
 * A year is a leap year if:
 * 1. Divisible by 400, OR
 * 2. Divisible by 4 and NOT divisible by 100.
 */
public class LeapYear {
    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeap(year)) {
            System.out.println(year + " is a Leap Year (true / 1)");
        } else {
            System.out.println(year + " is NOT a Leap Year (false / 0)");
        }

        sc.close();
    }
}
