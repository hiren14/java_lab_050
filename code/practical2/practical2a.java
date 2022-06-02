package practical2;
import java.util.Scanner;
public class practical2a{
    public static void main (String[] args){
        int i;
        int temp;
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("enter enter three integers ");
        for(i=0;i<3;i++){
           arr[i] =sc.nextInt();
        }
        // sort algo bubble 
        for(i=0;i<3;i++){
            for(int k=0;k<2-i;k++){
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