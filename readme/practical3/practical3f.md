<h1 align="center" style="margin-top: 0px;">
Practical 3 f 
</h1>

#	3. 	f) Write a program to per form following operations on string “GEC PATAN”                                  

## Reverse the string                                                                                                         

## Replace character EC with   OV 
##                                                                                                Check whether strings “PAT”and“UNI” present in original string or not 
## Compare this program implementation using String and StringBuffer class  methods.

## Code 

```java
public class practical3f {
public static void main(String[] args) {
    String test = "GEC PATAN",rev="";
    char c;
    for(int i=0;i<test.length();i++){
        c=test.charAt(i);
        rev=c+rev;
    }    
    StringBuffer s = new StringBuffer("GEC PATAN");
    System.out.println("The Reverse string: "+rev);
    System.out.println("The Reverse string: "+s.reverse());    // USING STRINGBUFFER CLASS!!
    String rep = test.replace("EC", "OV");
    System.out.println("The Replaced string: "+rep);
    System.out.println("Dose Original string contains PAT? ");
    System.out.println(test.contains("PAT"));
    System.out.println("Dose Original string contains PAT? ");
    System.out.println(test.contains("UNI"));
}
    
}
```
# Output 


![p1a](https://hiren14.github.io/java_lab_050/output/practical3/output3f.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)