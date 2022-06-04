<h1 align="center" style="margin-top: 0px;">
Practical 4 a 
</h1>

#	3. 	a) Write an interactive program to compute the square root of a number. The input values must be tested for validity. If it is negative then user defined method MYSQRT() should raise an exception

## Code 
```java
import java.util.Scanner;
public class partical4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SqureRoot n= new SqureRoot();
        System.out.println("Enter the number: ");
        n.val = sc.nextInt(); 
        try{
            System.out.println("The Squre Root : "+n.mySqrt());
        }catch(NegativeValue e){
            System.out.println(e);
        }

    }

}

class SqureRoot{
    int val;
    int mySqrt()throws NegativeValue{
        if(val<0){
            throw new NegativeValue();
        }
        return (val*val);
    }
}

class NegativeValue extends Exception{
      
}
```
# Output 

![p1a](https://hiren14.github.io/java_lab_050/output/practical4/output4a.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)