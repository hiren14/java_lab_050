<h1 align="center" style="margin-top: 0px;">
Practical 4 d 
</h1>

#	4. 	d) Write a JAVA program that simulates the action ofseveral bank customers whomake depositsto a sharedaccount.Use concept of multithreading and synchronization. 	 	

## Code 

```java
public class partical4d
     {
public static void main(String[] args) throws InterruptedException
{
    BankAccount b1 = new BankAccount();
    
        Cost1 c1 = new Cost1(b1);
        Cost2 c2 = new Cost2(b1);
            c1.start();
            
            c2.start();
}
                }
class BankAccount
    {
        int amount=1000;
        synchronized void withdraw(int wiAmount)
        {

        String name = Thread.currentThread().getName();

if(amount<wiAmount)
    {

    System.out.println("Insufficient Balance!");

    System.out.println(name);
    }
else
    {
    amount=amount-wiAmount;

    System.out.println("Amount successfully withdraw!");

    System.out.println(amount+" is left");
    }

}
    }
class Cost1 extends Thread{

    BankAccount b1;

    Cost1(BankAccount b1)
    {

        this.b1=b1;
    }
@Override
public void run()
{
    b1.withdraw(1000);
}
}
class Cost2 extends Thread{

    BankAccount b1;

    Cost2(BankAccount b1)
    {
        this.b1=b1;
    }
@Override
public void run()
    {
b1.withdraw(1000);
    }
}
}
```
# Output 


![p1a](https://hiren14.github.io/java_lab_050/output/practical4/output4d.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)