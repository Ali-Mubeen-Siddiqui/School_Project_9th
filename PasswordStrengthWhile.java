/* PasswordStrengthWhile.java */
import java.util.Scanner;

public class PasswordStrengthWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tPassword Strength Checker\nEnter your password: ");
        String password = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;
        int i = 0;

        while (i < password.length()) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                special++;
            }

            i++;
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + special);

        sc.close();
    }
}
