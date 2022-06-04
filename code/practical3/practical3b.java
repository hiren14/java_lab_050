package practical3;
import java.util.Scanner;
public class practical3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your expression:");
        String test=sc.nextLine();
        String exp=test.replaceAll(" ","");

        System.out.println("The Expression: "+exp);
        
        int i=0;
        
        int count=0;
        
        for(int j=0;j<exp.length();j++){
        
            if(exp.charAt(j)>41 && exp.charAt(j)<48)
        
            count++;
        
        }
        
        if(count>1 || count==0)
        {
            
            System.out.println("Enter a valid expression !");
        }
        else if(exp.charAt(0)>41 && exp.charAt(0)<48)
        {
            System.out.println("Enter valid expression !");
        }
        else if(exp.charAt(exp.length()-1)>41 && exp.charAt(exp.length()-1)<48){
        
        System.out.println("Enter valid expression !");
        }
        else
        {
          
        while(exp.charAt(i)!='+' && exp.charAt(i)!='-'&&  exp.charAt(i)!='*' && exp.charAt(i)!='/')
        {
        i++;
        }
        switch(exp.charAt(i)){
            case '+':
            System.out.println("The result: "+((Integer.parseInt(exp.substring(0,i))+(Integer.parseInt(exp.substring(i+1,exp.length()))))));
         
         break;
         
         case '-':
         
         System.out.println("The result: "+((Integer.parseInt(exp.substring(0,i))-(Integer.parseInt(exp.substring(i+1,exp.length()))))));
         
         break;
        
        case '*':
            System.out.println("The result: "+((Integer.parseInt(exp.substring(0,i))*(Integer.parseInt(exp.substring(i+1,exp.length()))))));
        
        break;
        
        case '/':
            System.out.println("The result: "+((Float.parseFloat(exp.substring(0,i))/(Float.parseFloat(exp.substring(i+1,exp.length()))))));
        
        break;
        
        }
        }
    }
}