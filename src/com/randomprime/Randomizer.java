package com.randomprime;

import java.util.Random;
import java.util.concurrent.*;

public class Randomizer implements Runnable {
	ConcurrentLinkedQueue<Integer> ramdomsQueue;
	ConcurrentLinkedQueue<Pair> pairQueue;

	Randomizer(ConcurrentLinkedQueue<Integer> in, ConcurrentLinkedQueue<Pair> out) {
		this.ramdomsQueue = in;
		this.pairQueue = out;
	}

	public void run() {
		Random random = new Random();
		try {
			for (int i = 1; i < 100; i++) {
				int num = random.nextInt(100000);
				ramdomsQueue.add(num);
				Thread.sleep(100);
				while (!pairQueue.isEmpty()) {
					Pair p = pairQueue.poll();
					System.out.println(" Integer: " + p.number + " isPrime: " + p.isPrime);
			}
			
			

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
