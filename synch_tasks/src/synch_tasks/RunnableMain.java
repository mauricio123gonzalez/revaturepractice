package synch_tasks;

public class RunnableMain {

    public static void main(String[] args) 
    { 
        System.out.println("Main - " + Thread.currentThread().getName()); 
        Thread t1 = new Thread(new RunnableMain().new RunnableImpl()); 
        t1.start(); 
    } 
  
    private class RunnableImpl implements Runnable { 
  
        public void run() 
        { 
            System.out.println(Thread.currentThread().getName() +" current"); 
        } 
    } 
} 