/* ShopBill.java */
import java.util.Scanner;

public class ShopBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tWelcome to Shop Billing System!");
        System.out.println("This program calculates the total bill for each customer.\n");

        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.println("\nCustomer " + i + ":");

            System.out.print("Enter number of items bought: ");
            int items = sc.nextInt();

            double total = 0;

            for (int j = 1; j <= items; j++) {
                System.out.print("Enter price of item " + j + ": ");
                double price = sc.nextDouble();
                total += price;
            }

            System.out.println("Total bill for Customer " + i + ": Rs. " + total);
        }

        System.out.println("\nThank you for using the system .");
        sc.close();
    }
}
