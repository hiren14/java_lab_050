<h1 align="center" style="margin-top: 0px;">
Practical 3 a 
</h1>

#	3. 	a) Write a program that creates a Random object with seed 1000 and displays the  first 100 random integers between 1 and 49 using the NextInt (49) method. 	 	

## code 

```java
class paractical3a {
    public static void main(String[] args) {
        java.util.Random randomNo = new java.util.Random(1000);
 
        // displays first 100 random integers between 0 to 49
        System.out.println(" 100 Random numbers are : ");
        for (int i = 0; i < 100; i++) {
            System.out.print(randomNo.nextInt(49) + " ");
        }
    }
}

```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)