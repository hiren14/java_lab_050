<h1 align="center" style="margin-top: 0px;">
Practical 3 a 
</h1>

#	3. 	a) Write a program that creates a Random object with seed 1000 and displays the  first 100 random integers between 1 and 49 using the NextInt (49) method. 	 	

## Code 

```java
import java.util.Random;
import java.util.random;
public class practical12 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i =0 ; i<100 ; i++)
        {
            System.out.format("%5d", random.nextInt(49));
            if((i+1) %20==0)
            {
                System.out.println();
            }
        }
    }
}
```
# Output 

![p3a](/output/practical3/output3a.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)