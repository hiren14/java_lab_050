<h1 align="center" style="margin-top: 0px;">Practical 2 a
</h1>

# 2. 	a) Write a program that prompts the user to enter three integers and display the  integers in decreasing order. 	

## code 

```java
import java.util.Scanner;
public class practical2a{
    public static void main (String[] args){
        int i;
        int temp;
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        for(i=0;i<5;i++){
           arr[i] =sc.nextInt();
        }
        // sort algo bubble 
        for(i=0;i<4;i++){
            for(int k=0;k<4-i;k++){
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
## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)