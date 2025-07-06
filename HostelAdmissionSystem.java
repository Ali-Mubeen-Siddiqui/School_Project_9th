/* HostelAdmissionSystem.java */
import java.util.Scanner;

public class HostelAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to Hostel Admission System:");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter gender (boy or girl): ");
        String gender = sc.next();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 20) {
            System.out.println("\nInsufficient marks for admission.");
            System.exit(0);
        }
        else {
            if (marks < 80) {
                if (gender.equalsIgnoreCase("boy")) {
                    System.out.println("\n" + name + " is allotted Hostel B.");
                }
                else if (gender.equalsIgnoreCase("girl")) {
                    System.out.println("\n" + name + " is allotted Hostel D.");
                }
                else {
                    System.out.println("\nInvalid gender entered.");
                }
            } else {
                if (gender.equalsIgnoreCase("boy")) {
                    System.out.println("\n" + name + " is allotted Hostel A.");
                }
                else if (gender.equalsIgnoreCase("girl")) {
                    System.out.println("\n" + name + " is allotted Hostel C.");
                }
                else {
                    System.out.println("\nInvalid gender entered.");
                }
            }
        }

        sc.close();
    }
}
