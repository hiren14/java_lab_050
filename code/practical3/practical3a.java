package practical3;

import java.util.Random;
//import java.util.random;
public class practical3a {

    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i =0 ; i<100 ; i++)
        {
            System.out.format("%5d", random.nextInt(49));
            if((i+1) %20==0)
            {
                System.out.println();
            }
        }
    }
}
