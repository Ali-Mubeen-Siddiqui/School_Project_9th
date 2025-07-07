/*FibGen.java*/
import java.util.Scanner;

public class FibGen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to Fibonacci series generator!\nEnter number of terms(1 to n): ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int third;
        System.out.println("\tFibonacci Series: ");
        for (int i = 0;i<num;i++){
            System.out.println(first);
            third = first+second;
            first = second;
            second = third;
        }
        sc.close();
    }
}