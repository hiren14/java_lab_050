package practical2;

import java.util.Scanner;
 public class practical2f
 {
 
    public static void reverse(int list[]) {
        int temp;
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int numbers[] = new int[10];
 
        // prompt the user to enter ten numbers
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
 
        // Call reverse nethod to reverse the numbers
        reverse(numbers);
 
        // display the numbers
        System.out.print("Numbers in Reverse order are : ");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}