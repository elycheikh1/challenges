package com.randomprime;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.IntStream;

public class Prime implements Runnable{
	ConcurrentLinkedQueue<Integer> ramdomsQueue;
	ConcurrentLinkedQueue<Pair> pairQueue;
	Prime(ConcurrentLinkedQueue<Integer> in,ConcurrentLinkedQueue<Pair> out){
		this.ramdomsQueue=in;
		this .pairQueue=out;
	}
	public void  run(){
		int num;
		
		for(int i=0;i<100;i++){
			while(!ramdomsQueue.isEmpty()){
				num=ramdomsQueue.poll();
				Pair o = new Pair(num, isPrime(num));
				pairQueue.add(o);
			}
				try{
					Thread.currentThread();
					Thread.sleep(200);
					
				}
				catch(Exception e){e.printStackTrace();}
			
		}
		
		
	}
	//logic to check if number is prime or not
	public static boolean isPrime(int num){
		
		return num > 2
			      && IntStream.rangeClosed(2, (int) Math.sqrt(num))
			      .noneMatch(n -> (num % n == 0));
	}

}