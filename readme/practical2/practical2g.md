<h1 align="center" style="margin-top: 0px;">
Practical 2 f 
</h1>

#	2.		g) Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and  1’s , display the matrix, check every raw and column have an odd number’s of  1’s.	 	

## code 

```java
public class practical2g {
    public static void main(String[] args) {
 
        // creating a 6X6 matrix
        int[][] matrix = new int[6][6];
 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
 
        // Display whether every row and columns have odd number of 1s
        System.out.println("Envery row" + (isRowsOdd1s(matrix) ? " " : " does not " + "have an odd number of 1s"));
        System.out.println("Envery row" + (isColumnOdd1s(matrix) ? " " : " does not " + "have an odd number of 1s"));
    }
 
    // isRowsOdd1s implementation
    public static boolean isRowsOdd1s(int m[][]) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count % 2 == 0)
                return false;
        }
        return true;
    }
 
    // isColumnOdd1s implementation
    public static boolean isColumnOdd1s(int m[][]) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == 1)
                    count++;
            }
            if (count % 2 == 0)
                return false;
        }
        return true;
    }
}

```

## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)