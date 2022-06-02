package practical3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class practical3c {
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