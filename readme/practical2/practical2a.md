<h1 align="center" style="margin-top: 0px;">Practical 2 a
</h1>

# 2. 	a) Write a program that prompts the user to enter three integers and display the  integers in decreasing order. 	

## Code 

```java
import java.util.Scanner;
public class practical2a{
    public static void main (String[] args){
        int i;
        int temp;
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("enter enter three integers ");
        for(i=0;i<3;i++){
           arr[i] =sc.nextInt();
        }
        // sort algo bubble 
        for(i=0;i<3;i++){
            for(int k=0;k<2-i;k++){
                if(arr[k]>arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println("Sorted arr");
        for(int j=0;j<5;j++)
        System.out.println(arr[j]);


    }
}
```

# Output 

![p2a](/output/practica2/output2a.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)