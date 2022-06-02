<h1 align="center" style="margin-top: 0px;">
Practical 1 d
</h1>

#	d) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by  taking your weight in kilograms and dividing by the square of your height in  meters. Write a program that prompts the user to enter a weight in pounds and  height in inches and displays the BMI.  
# Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.	

## code

```java
import java.util.Scanner;
public class practical1d {
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
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)
