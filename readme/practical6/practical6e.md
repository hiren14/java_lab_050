<h1 align="center" style="margin-top: 0px;"> Practical 6 d </h1> 

# 6.    e) Write a program that reads words from a text file and displays all the  nonduplicate words in descending order. The text file is passed as a command line argument. 	


## code


```java
import java.io.*;
import java.util.*;

class Practical_25 {
    public static void main(String[] args) {
        if(args.length==1){
            String fileName = args[0];
            TreeSet<String> set = new TreeSet<>();
            File file = new File(fileName);
            try {
                Scanner s = new Scanner(file);
                while (s.hasNext()){
                    set.add(s.next());
                }
                System.out.println(set);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Please, Pass the File Name as Command Line Argument");
        }
    }
}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)