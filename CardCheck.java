/* CardCheck.java*/
import java.util.Scanner;

public class CardCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to check you eligibility for credit card");
        
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        System.out.println("Enter your monthly income(in rupees): ");
        double income = sc.nextDouble();
        
        System.out.println("Please share your credit score: ");
        int credit_score = sc.nextInt();
        
        String response = isEligible(age, income, credit_score);
        System.out.println("\n" + response);
        sc.close();
    
    }    
    
    public static String isEligible(int age,double income ,int credit_score){
        if (age<18 || income<20000 || credit_score<600){
            return "Sorry, you do not qualify for a credit card.";
        }
        else{
        return "Congratulations! You are eligible for a credit card";
        }
    }
}