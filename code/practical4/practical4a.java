package practical4;
import java.util.Scanner;
public class practical4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SqureRoot n= new SqureRoot();
        System.out.println("Enter the number: ");
        n.val = sc.nextInt(); 
        try{
            System.out.println("The Squre Root : "+n.mySqrt());
        }catch(NegativeValue e){
            System.out.println("negative value" + e);
        }

    }

}

class SqureRoot{
    int val;
    int mySqrt()throws NegativeValue{
        if(val<0){
            throw new NegativeValue();
        }
        return (val*val);
    }
}

class NegativeValue extends Exception{
      
}