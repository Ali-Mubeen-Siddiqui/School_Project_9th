/*BloodDonation.java*/
import java.util.Scanner;

public class BloodDonation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to blood donation camp! lets check your eligibility.");
        // getting input
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter weight (in kg): ");
        float weight = sc.nextFloat();
        System.out.println("Do you have a medically proven disorder(yes or no):");
        String health = sc.next();
        
        if (health.equalsIgnoreCase("yes")){
            System.out.println("\nSorry but you can't donate blood being ill.");
            System.exit(0);
        }
        else{
            if (weight >= 50.0 && age >= 18){
                System.out.println("\nYou are eligible to donate your blood!");
            }
            else{
                System.out.println("\nSorry either you're too young or underweight to donate blood .");
            }
        }
        sc.close();
    }
}