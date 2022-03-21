package main.java.edu.rohan.parallelismNConcurrency;

public class Concurrency {
    private static int counter = 10;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            //Have Locking
            if (counter > 0) {
                //Do Something
                counter--;
            }
        }).start();

        new Thread(() -> {
            //Have Locking
            if (counter > 0) {
                //Do Something
                counter--;
            }
        }).start();

        Thread.sleep(1000);
    }
}
