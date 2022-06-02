<h1 align="center" style="margin-top: 0px;"> Practical 6 b </h1> 

# 6. 	b) Write a recursive method that returns the smallest integer in an array. Write a  test program that prompts the user to enter an integer and display its product. 

## code

```java
import java.util.Scanner;
 
public class practical6b {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int product = 1;
 
        System.out.println("Enter eight integers : ");
        int list[] = new int[8];
 
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
            product = product * list[i];
        }
        System.out.println("The smallest element is " + min(list));
        System.out.println("The Product of all integers is " + product);
    }
 
    // method that finds largest number in an array
    public static int min(int list[]) {
        int min = list[list.length - 1];
        int index = list.length - 1;
        return min(list, index, min);
    }
 
    // overloaded method
    private static int min(int list[], int index, int min) {
        if (index < 0)
            return min;
        else if (list[index] < min)
            return min(list, index - 1, list[index]);
        else
            return min(list, index - 1, min);
    }
}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)