<h1 align="center" style="margin-top: 0px;">
Practical 2 c 
</h1>

#	2.		c) Assume a vehicle plate number consists of three uppercase letters followed by  four digits. Write a program to generate a plate number. 	

## Code 

```java
//random number plate generator
public class practical2c
{
    public static void main(String[] args) 
    {
        int[] myArr = new int[7];
        
        System.out.println("the auto  generate a plate number. is");
        for(int i=0;i<3;i++)
        {
            myArr[i]=65 + (int) (Math.random()*26);
        }
        for(int i=3;i<7;i++)
        {
            myArr[i]=(int) (Math.random()*10);
        }
        for(int i=0;i<3;i++)
        {
            System.out.printf("%c",(char)myArr[i]);
        }
        for(int i=3;i<7;i++)
        {
            System.out.print(myArr[i]);
        }
        System.out.println();
    }    
}

```

# Output 

![p1a](https://hiren14.github.io/java_lab_050/output/practical2/output2c.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)