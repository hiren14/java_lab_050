package practical6;
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
