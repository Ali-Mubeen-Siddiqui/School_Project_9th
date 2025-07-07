/* ProfitLossCalculator.java */
import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tWelcome to Profit & Loss Calculator!");

        System.out.println("Enter Cost Price (CP): ");
        double cp = sc.nextDouble();


        System.out.println("Enter Selling Price (SP): ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("\nYou made a profit of Rs. " + profit);
        } else {
            if (sp < cp) {
                double loss = cp - sp;
                System.out.println("\nYou made a loss of Rs. " + loss);
            } else {
                System.out.println("\nNo profit, no loss.");
            }
        }

        sc.close();
    }
}
