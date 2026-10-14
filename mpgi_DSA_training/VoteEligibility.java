import java.util.Scanner;

/**
 * Problem: Voting Eligibility (01/10/2026 - Q4)
 * 
 * Write a function that takes in age as input and returns if that person 
 * is eligible to vote or not. A person of age > 18 is eligible to vote.
 */
public class VoteEligibility {
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (isEligibleToVote(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        sc.close();
    }
}
