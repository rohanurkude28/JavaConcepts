package edu.rohan.parallelismNConcurrency;

public class Parellelism {
    public static void main(String[] args) throws InterruptedException {
        int counter = 10;

        new Thread(() -> {
                //Do Something
        }).start();

        new Thread(() -> {
            //Do Something
        }).start();

        // Do Something Else
        Thread.sleep(1000);
    }
}
