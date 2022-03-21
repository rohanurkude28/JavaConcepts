package main.java.edu.rohan.serviceexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolServiceExecutorExample {

	public static void main(String[] args) {
		ExecutorService executorService= Executors.newFixedThreadPool(10);
		
		for(int i=0;i<100;i++)
		
		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task of Thread: "+Thread.currentThread().getName());
		    }
		});

		executorService.shutdown();
	}
}
