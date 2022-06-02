package practical1;
import java.util.Scanner;
public class practical01b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x first ");
        float a = sc.nextFloat();
        System.out.println("enter the value y of first ");
        float b = sc.nextFloat();
        System.out.println("enter the value constant of first ");
        float e = sc.nextFloat();
        System.out.println("enter the value x of second ");
        float c = sc.nextFloat();
        System.out.println("enter the value y of second ");
        float d = sc.nextFloat();
        System.out.println("enter the value constant of second ");
        float f = sc.nextFloat();
        System.out.println(a+"x"+ " + " +b+"y"+ " = " +e);
        System.out.println(c+"x"+ " + " +d+"y"+ " = " +f);

        float x = ((e*d)-(b*f))/((a*d)-(b*c));
        float y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("The value of x and y is "+x +" " +b);


    }
    
}