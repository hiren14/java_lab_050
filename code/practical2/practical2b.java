package practical2;

import java.util.Scanner;

public class practical2b
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a string ");
        
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


