/*GuessingGame.java*/
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome to number guessing game! \nGuess the number between 0 to 9");
        int user = 0;
        int com = 0;
        for (int i = 0;i<5;i++){
            int num = (int) (Math.random() * 10);
            int guess = sc.nextInt();
            if (guess==num){
                user++;
                
            }
            else{
                com++;
            }
            
            System.out.println("points : " + user);
        }
        if (user>com){
            System.out.println("\nYou win with " + user + " points");
        }
        else{
            System.out.println("\nYou lose with " + user + " points");
        }
        //they cant be equal or draw because the loop runs 5 times
        sc.close();
    }
}