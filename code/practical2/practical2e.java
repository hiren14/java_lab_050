package practical2;

import java.util.Scanner;

class practical2e
{
    public static void Gcd(int a , int b)
     {
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("gcd of "+a+" and "+b+" is:"+gcd);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter first element:");
        x =sc.nextInt();
        System.out.println("Enter second element:");
        y =sc.nextInt();
 
 Gcd(x,y);
    }
}
