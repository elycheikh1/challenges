package com.randomprime;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		
		
		ConcurrentLinkedQueue<Integer> ramdomsQueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<Pair> pairQueue = new ConcurrentLinkedQueue<Pair>();

		new Thread(new Randomizer(ramdomsQueue, pairQueue)).start();
		new Thread(new Prime(ramdomsQueue, pairQueue)).start();
		
	}
}