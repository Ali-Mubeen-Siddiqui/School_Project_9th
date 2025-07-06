/*TemperatureConvertor.java*/
import java.util.Scanner;

public class TemperatureConvertor{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("\tTemperature Convertor");
         // getting input
         System.out.println("Enter temperature:");
         double temp = sc.nextDouble();
         System.out.println("Enter unit(F or C):");
         String unit = sc.next();
         // preparing and showing output
         String answer = convert(temp,unit);
         System.out.println("\n"+ answer);
         sc.close();       
    }
    
    public static String convert(double temp,String unit){
        if (unit.equalsIgnoreCase("f")){
            double result = (temp-32)*5.0/9;
            return result + " degrees celsius";
        }
        else if(unit.equalsIgnoreCase("c")){
            double result = (temp*(9.0/5)) + 32;
            return result + " degrees fahrenheit";
        }
        return "unknown unit";
    }
}
