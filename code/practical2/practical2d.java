package practical2;
import java.util.Scanner;

public class practical2d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        factor(a);
    }
    public static void factor(int num)
    {
        int i=2;
        while(num>1)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                num=num/i;
            }
            else
            {
                i++;
            }
        }
    }
}
