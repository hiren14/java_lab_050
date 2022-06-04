<h1 align="center" style="margin-top: 0px;">
Practical 4 e 
</h1>

#	4. 	e) Create thread t1 and t2. Set priority of main thread to 10, t1 to normal priority + 2 and t2 to normal priority -2.
## Code 

```java
public class practical4e {
    public static void main(String[] args) 
    {
        A t1 = new A();
    
        B t2 = new B();
        
        Thread.currentThread().setPriority(10);
    
            t1.setPriority(2);
    
            t2.setPriority(-2);
 System.out.println("Name : "+Thread.currentThread().getName()+"The priority: "+Thread.currentThread().getPriority());
   
        t1.start();
    
        t2.start();

    }

}
    
    class A extends Thread {
    public void run()
     {
        System.out.println("Name : "+Thread.currentThread().getName()+"The priority: "+Thread.currentThread().getPriority());
    
    }
    
}
    
    class B extends Thread 
    {
    public void run() 
    {
System.out.println("Name : "+Thread.currentThread().getName()+"The priority: "+Thread.currentThread().getPriority());
    }
    }
```
# Output 


![p1a](https://hiren14.github.io/java_lab_050/output/practical4/output4e.png)


## License
[MIT](https://hiren14.github.io/java_lab_050/LICENSE)