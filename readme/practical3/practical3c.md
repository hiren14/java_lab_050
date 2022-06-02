<h1 align="center" style="margin-top: 0px;">
Practical 3 c 
</h1>

#	c) Write a program that creates an Array List and adds a Loan object , a Date object  , a string, and a Circle object to the list, and use a loop to display all elements in the list by invoking the object’s to String() method. 	
## code 

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


  ArrayList<Object> arr_list = new ArrayList<Object>();
        double loan_amt;
            System.out.println("enter the loan amt");
          loan_amt =  sc.nextDouble();
       System.out.println("enter the radius");
    
       double radius = sc.nextDouble();;
         
         
          arr_list.add(new Loan(loan_amt));  
  arr_list.add(new Date());  
  arr_list.add( "hi here "); 
  arr_list.add(new Circle(radius)); 

  for (int i = 0; i < arr_list.size(); i++) 
  {
   System.out.println((arr_list.get(i)).toString());
  }
 }
}

class Circle
{
 double radius;
 Circle(double r)
 {
  this.radius=r;
 }
 public String toString()
 {
  return "Circle with Radius "+this.radius;
 }
}

class Loan
{
 double amount;
 Loan(double amt)
 {
  this.amount=amt;
 }
 public String toString()
 {
  return "Loan with Amount "+this.amount;
 }
}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)