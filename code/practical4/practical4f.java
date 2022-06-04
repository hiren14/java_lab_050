package practical4;

public class practical4f {
        public static void main(String[] args) {
            A t1 = new A();
            B t2 = new B();
            Thread.currentThread().setPriority(10);
            t1.setPriority(2);
            t2.setPriority(-2);
            System.out.println("Name : "+Thread.currentThread().getName()+" The priority: "+Thread.currentThread().getPriority());
            t1.start();
            t2.start();
        }
    }
    
    class A extends Thread {
        public void run() {
            System.out.println("Name : "+Thread.currentThread().getName()+" The priority: "+Thread.currentThread().getPriority());
       }
    }
    
    class B extends Thread {
        public void run() {
            System.out.println("Name : "+Thread.currentThread().getName()+" The priority: "+Thread.currentThread().getPriority());
       }
    }
       
}
