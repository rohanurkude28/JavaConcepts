package main.java.edu.rohan.synchronousqueue;
import java.util.concurrent.SynchronousQueue;
 
public class QueueConsumer implements Runnable {
 
    private SynchronousQueue queue;
 
    public QueueConsumer(SynchronousQueue queue) {
        this.queue=queue;
    }
 
    @Override
    public void run() {
        try {
            Object event = queue.take();
            // thread will block here
            System.out.printf("[%s] consumed event : %s %n", Thread
                    .currentThread().getName(), event);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     
    }
     
}