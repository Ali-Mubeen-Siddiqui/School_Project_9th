/* GenderPrefix.java */
import java.util.Scanner;

public class GenderPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Male\n2.Female\n3.Other: ");
        System.out.println("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("Prefix: Mr."); 
                break;
            case 2: 
                System.out.println("Prefix: Ms."); 
                break;
            case 3: 
                System.out.println("Prefix: Mx."); 
                break;
            default: 
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
