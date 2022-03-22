package edu.rohan.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionMet {

    private Lock lock = new ReentrantLock();
    private Condition added = lock.newCondition();
    private Condition removed = lock.newCondition();
    private int count = 0;
    private int MAX_COUNT = Integer.MAX_VALUE;

    public void produce() throws InterruptedException {
        lock.lock();
        try {
            while (count == MAX_COUNT)
                removed.await();

            //add Data
            added.signal();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0)
                added.await();

            //get Data
            removed.signal();
            //return data
        } finally {
            lock.unlock();
        }
    }
}
