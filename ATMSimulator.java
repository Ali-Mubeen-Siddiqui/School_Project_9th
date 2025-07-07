/* ATMSimulator.java */
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        System.out.println("\tWelcome to ATM!");

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount Deposited. New Balance: Rs. " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Amount Withdrawn. New Balance: Rs. " + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Nested loop: ask user if they want another transaction
            char again;
            do {
                System.out.print("Do you want another transaction? (y/n): ");
                choice = sc.next().charAt(0);
                again = choice;
            } while (again != 'y' && again != 'n');

        } while (choice == 'y');

        System.out.println("\nGoodbye!");
        sc.close();
    }
}
