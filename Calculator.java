/* Calculator.java */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tSimple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        

        System.out.println("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                
                break;
            case 2:
                result = num1 - num2;
                
                break;
            
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }
        System.out.println("Result: " + result);

        sc.close();
    }
}

                                                                                                            