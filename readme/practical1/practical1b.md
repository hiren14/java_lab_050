<h1 align="center" style="margin-top: 0px;"> Practical 1 b </h1> 

# 1. 		b) Write a program that solves the following equation and displays the value x and  y: 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation  ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )	


## Code

```java
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
```

# Output 

![p1b](/output/practical1/output1b.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)