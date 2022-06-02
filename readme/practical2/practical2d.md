<h1 align="center" style="margin-top: 0px;">
Practical 2 d 
</h1>

#		d) Write a program that reads an integer and displays all its smallest factors in  increasing order. For example if input number is 120, the output should be as  follows: 2,2,2,3,5. 	

## code 

```java
//find factor of a number
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

```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)