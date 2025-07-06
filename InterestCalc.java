/*InterestCalc.java*/
import java.util.Scanner;

public class InterestCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tInterest Calculator");
        // getting input
        System.out.println("Enter principal: ");
        double principle = sc.nextDouble();
        System.out.println("enter rate :");
        double rate = sc.nextDouble();
        System.out.println("Enter time in years :");
        double time = sc.nextDouble();
        System.out.println("Enter SI or CI :");
        String method = sc.next();
        // preparing and showing output
        double result = interest(principle,rate,time,method);
        System.out.println(method+" = "+result);
    }
    public static double interest(double p,double r,double t, String i){
        if (i.equalsIgnoreCase("si")){
            double intrst = (p*r*t)/100;
            return intrst;
        }
        else{
            double intrst = p* (Math.pow(1+r/100,t)) - p;
            return intrst;
        }
    }
}