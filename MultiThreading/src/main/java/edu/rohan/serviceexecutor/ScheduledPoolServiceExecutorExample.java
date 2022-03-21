package edu.rohan.serviceexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ScheduledPoolServiceExecutorExample {
	public static void main(String[] args) {

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
		System.out.println("=========================>schedule");
		ReentrantLock lock = new ReentrantLock();

		lock.lock();
		for (int i = 0; i < 100; i++)

			executorService.schedule(() -> {
					System.out.println("Asynchronous task of Thread: " + Thread.currentThread().getName());
			}, 10, TimeUnit.SECONDS);
		lock.unlock();

		lock.lock();
		System.out.println("=========================>scheduleAtFixedRate");
		for (int i = 0; i < 100; i++)

			executorService.scheduleAtFixedRate(() -> {
					System.out.println("Asynchronous task of Thread: " + Thread.currentThread().getName());
			}, 2, 3, TimeUnit.SECONDS);
		lock.unlock();

		lock.lock();
		System.out.println("=========================>scheduleWithFixedDelay");
		for (int i = 0; i < 100; i++)

			executorService.scheduleWithFixedDelay(() -> {
					System.out.println("Asynchronous task of Thread: " + Thread.currentThread().getName());
			}, 2, 3, TimeUnit.SECONDS);
		lock.unlock();
		executorService.shutdown();
	}
}
