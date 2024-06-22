
## Fibonacci 

``` java

class FibonacciExample1{
public static void main(String args[])
{  
 int n1=0,n2=1,n3,i,count=10;  
 System.out.print(n1+" "+n2);//printing 0 and 1  
  
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
 {  
  n3=n1+n2;  
  System.out.print(" "+n3);  
  n1=n2;  
  n2=n3;  
 }  

}}

```

<hr />

## Program to find the frequency of each element in the array
```java

public class Frequency {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  
```

<hr >

## Program to print the duplicate elements of an array


```java

public class DuplicateElement {  
public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  

```
<hr>

## Example to reverse string in Java by using static method

```java

import java.util.Scanner;  
public class ReverseStringExample3  
{  
public static void main(String[] arg)  
{  
ReverseStringExample3 rev=new ReverseStringExample3();  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string : ");  
String  s=sc.nextLine();      
System.out.println("Reverse String  is : "+rev.reverse(s)); //calling method  
}  
//calling method   
static String reverse(String str)  
{  
String rev="";  
for(int i=str.length();i>0;--i)  
{  
rev=rev+(str.charAt(i-1));   
}  
return rev;  
}  
}
```
<hr>


## Linear Search 

```java

public class LinearSearchExample{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    
```

<hr >

## BinarySearch

```java

class BinarySearchExample{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  

```

## BubbleSort
```java

public class BubbleSortExample {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
```
<hr> 

## Java program to find the duplicate characters in a string

```java

public class DuplicateCharacters {    
     public static void main(String[] args) {    
        String string1 = "Great responsibility";    
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
    }    
}     
```

### patterns
[Basic](https://youtu.be/xzstcj3Cuso?si=mBy0SXaX2x2oo1qH)

[Pattern 2](https://youtu.be/UGm5lEJmN6g?si=Kwl4nnNpQ37IMPdu)

[Pattern 3](https://youtu.be/WvPivXh02TM?si=yNMmSiTHcxt2yALc)

[Pattern 4](https://youtu.be/NsfBg5HiAiA?si=t2NlssYjBNJJspZU)

## mcq
[Loop MCQ ](https://youtu.be/rt7Wrw__3D0?si=irNzxaoFJL4nQHFm)

# Note learn the sorting algorithms is most important 
