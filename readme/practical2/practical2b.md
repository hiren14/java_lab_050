<h1 align="center" style="margin-top: 0px;">
Practical 2 b 
</h1>

#	2.	b) Write a program that prompts the user to enter a letter and check whether a  letter is a vowel or constant. 	

## Code 

```java
import java.util.Scanner;

public class practical2b
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string you want ");
        char a=sc.next().charAt(0);
// logic for checking that the input is vowel 
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            System.out.println(a+" is a vowel");
        }
        else
        {
            System.out.println(a+" is a constant");
        }
    }    
}

```

# Output 

![p1a](/output/practical2/output2b.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)