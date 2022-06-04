<h1 align="center" style="margin-top: 0px;">Practical 1 c
</h1>

# 1. 	c) Write a program that reads a number in meters, converts it to feet, and displays  the result. 	

## Code
```java
import java.util.Scanner;
public class practical1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of meters ");
        float a = sc.nextFloat();
        double x = a*3.281f;
        System.out.println("total in feet is "+x);
    }                        
    
}
```

# Output 

![p1a](https://hiren14.github.io/java_lab_050/output/practical1/output1c.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)