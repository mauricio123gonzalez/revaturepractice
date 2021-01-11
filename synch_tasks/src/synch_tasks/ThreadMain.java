package synch_tasks;

public class ThreadMain extends Thread{

    public void run() {
        System.out.println("Thread");
    }

    public static void main(String args[]) {
        (new ThreadMain()).start();
    }

}