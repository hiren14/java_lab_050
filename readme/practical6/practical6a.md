<h1 align="center" style="margin-top: 0px;"> Practical 6 a </h1> 

# 6. 	a) Write a program to create a file name 123.txt, if it does not exist. Append a new  data to it if it already exist. write 150 integers created randomly into the file  using Text I/O. Integers are separated by space. 

## code

```java
import java.io.*;
import java.util.Scanner;

class practical6a 
{
   public static void main(String[] args) 
 {

     try (
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));
     ) {
        for (int i = 0; i < 150; i++) 
  {
          pw.print((int)(Math.random() * 150) + " ");
        }
    } 
    catch (FileNotFoundException fnfe) 
 {
        System.out.println("Cannot create the file.");
        fnfe.printStackTrace();
     }
  }
}
```

# Output 

![p1a](https://hiren14.github.io/java_lab_050/output/practical6/output6a.png)

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)