package edu.rohan.serviceexecutor;

import java.util.Random;
import java.util.concurrent.*;

public class FixedPoolCallableService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> integerFuture = executorService.submit(new Task());
        Integer result =integerFuture.get(); // Blocking

        System.out.println(result);
    }

    static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return new Random().nextInt();
        }
    }
}
