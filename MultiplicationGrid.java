/* MultiplicationGrid.java */
import java.util.Scanner;

public class MultiplicationGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to Multiplication Grid Generator!\nEnter how many tables to print: ");
        int tables = sc.nextInt();

        for (int i = 1; i <= tables; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println(); // Next row
        }

        sc.close();
    }
}
