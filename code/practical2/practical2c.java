package practical2;
public class practical2c
{
    public static void main(String[] args) 
    {
        int[] myArr = new int[7];
        System.out.println("the auto  generate a plate number. is");
        for(int i=0;i<3;i++)
        {
            myArr[i]=65 + (int) (Math.random()*26);
        }
        for(int i=3;i<7;i++)
        {
            myArr[i]=(int) (Math.random()*10);
        }
        for(int i=0;i<3;i++)
        {
            System.out.printf("%c",(char)myArr[i]);
        }
        for(int i=3;i<7;i++)
        {
            System.out.print(myArr[i]);
        }
        System.out.println();
    }    
}
