package edu.rohan.adderaccumulator;

import java.util.Random;
import java.util.concurrent.atomic.LongAccumulator;

public class AccumulatorTest {
	public static void main(String[] args) throws Exception{
	    LongAccumulator accumulator=new LongAccumulator(Long::max,Long.MIN_VALUE);
	    Thread[] ts=new Thread[100];

	    for(int i=0;i<100;i++){
	        ts[i]=new Thread(()->{
	            Random random=new Random();
	            long value=random.nextLong();
	            accumulator.accumulate(value);
	        });
	        ts[i].start();
	    }

	    for(int i=0;i<100;i++){
	        ts[i].join();
	    }
	    System.out.println(accumulator.longValue());
	}
}
