/* CardCheck.java*/
import java.util.Scanner;

public class CardCheck{
    public static void main(String[] args){
        
        final int MIN_AGE = 18;
        final int MIN_CREDIT_SCORE = 600;
        final double MIN_INCOME = 20000.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to check you eligibility for credit card");
        
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        System.out.println("Enter your monthly income(in rupees): ");
        double income = sc.nextDouble();
        
        System.out.println("Please share your credit score: ");
        int credit_score = sc.nextInt();
        
        String response = isEligible(age, income, credit_score,MIN_AGE,MIN_INCOME,MIN_CREDIT_SCORE);
        System.out.println("\n" + response);
        sc.close();
    
    }    
    
    public static String isEligible(int age,double income ,int credit_score, int MIN_AGE,double MIN_INCOME,int MIN_CREDIT_SCORE){
        if (age>=MIN_AGE && income>=MIN_INCOME && credit_score>=MIN_CREDIT_SCORE){
            return "Congratulations! You are eligible for a credit card";
        }
        else{
        return "Sorry, you do not qualify for a credit card";
        }
    }
}