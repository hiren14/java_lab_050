package practical6;
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