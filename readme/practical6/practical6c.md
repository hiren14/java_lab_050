<h1 align="center" style="margin-top: 0px;"> Practical 6 c </h1> 

# 6. 	c) Write a generic method that returns the minimum elements in a two  dimensional array. 

## code

```java
public class practical6c {

    public static void main(String[] args) {

        Integer[][] list = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = value++;
            }
        }

        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {

        E max = list[0][0];
        for (E[] elements : list) {
            for (E element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }

        return max;
    }
}
```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)