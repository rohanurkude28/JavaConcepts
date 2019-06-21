package edu.rohan.async;

import java.util.concurrent.CompletableFuture;

/*https://www.foreach.be/blog/parallel-and-asynchronous-programming-in-java-8*/
public class AsyncExample {
	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() -> 5).thenApply(i -> i * 3)
				.thenAccept(i -> System.out.println("The result is " + i))
				.thenRun(() -> System.out.println("Finished."));
	}
}
