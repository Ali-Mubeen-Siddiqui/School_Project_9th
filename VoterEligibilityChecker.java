/* VoterEligibilityChecker.java */
import java.util.Scanner;

public class VoterEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tWelcome to Voter Eligibility Checker!");

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter your nationality: ");
        String nationality = sc.next();

        if (age >= 18) {
            if (nationality.equalsIgnoreCase("Indian")) {
                System.out.println("\nYou are eligible to vote.");
            } else {
                System.out.println("\nYou are not eligible to vote. Only Indian citizens can vote.");
            }
        } else {
            System.out.println("\nYou are not eligible to vote. You must be at least 18 years old.");
        }

        sc.close();
    }
}
