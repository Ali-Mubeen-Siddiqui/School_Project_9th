/*SplitBill.java*/
import java.util.Scanner;

public class SplitBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tSplit your bill");
        // getting user input
        System.out.println("Enter your amount: ");
        double amount = sc.nextDouble();
        System.out.println("Is there any service charge(tip) [yes or no] :");
        String isTip = sc.next();
        // checking if tip exists
        if (isTip.equalsIgnoreCase("yes")){
            System.out.println("Enter service charge: ");
            double service_charge = sc.nextDouble();
            amount += service_charge;
        }
        
        System.out.println("Enter number of people:");
        int persons = sc.nextInt();
        // preparing and showing output
        double pay = amount/persons;
        System.out.println("Each person has to pay Rs. " + pay);
    }
}