/*Volume.java*/
import java.util.Scanner;

public class Volume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tSelect Shape: ");
        
        System.out.println("1.Cube\n2.Cuboid");
        int choice = sc.nextInt();
        double result = 0;
        
        switch (choice){
            case 1:
                System.out.println("Enter side: ");
                double v1 = sc.nextDouble();
                result = calc(v1);
                break;
            case 2:
                System.out.println("Enter length: ");
                double v2 = sc.nextDouble();
                System.out.println("Enter breadth: ");
                double v3 = sc.nextDouble();
                System.out.println("Enter height: ");
                double v4 = sc.nextDouble();
                
                result = calc(v2,v3,v4);
                break;
            default:
                System.out.println("\ninvalid input");
                System.exit(0);
        }
        System.out.println("\nVolume=" + result);
        sc.close();    
            
        
        
    }
    public static double calc(double side){
        return side*side*side;
    }
    public static double calc(double l,double b,double h){
        return l*b*h;
    }

}