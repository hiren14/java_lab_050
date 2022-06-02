package practical1;
import java.util.Scanner;
public class practical01d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the you weight in pound");
        double pd = sc.nextDouble();
        double kg = pd*0.45359237;
        System.out.println("enter you height in Inch ");
        double Inch = sc.nextDouble();
        double meter = Inch * 0.0254;
        double bmi = kg/(meter * meter);
        System.out.println("you bmi is " + bmi);
    }                        
    
}