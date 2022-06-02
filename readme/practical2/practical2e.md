<h1 align="center" style="margin-top: 0px;">
Practical 2 e 
</h1>

#	2.		e) Write a method with following method header: public static int gcd(int num1, int  num. Write a program that prompts the user to enter two integers and compute  the gcd of two integers. 	

## code 

```java
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

```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)