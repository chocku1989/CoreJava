package com.training.thread;

public class SynchronizedWorker implements Runnable {

	private volatile int count = 0;

	public static void main(String[] args) {
		SynchronizedWorker worker = new SynchronizedWorker();
		worker.doWork();
		System.out.println(worker.count);
	}

	public void increment() throws InterruptedException {
		synchronized (this) {
			count++; // count = count + 1;
		}

	}

	public void doWork() {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					try {
						increment();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					try {
						increment();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		});
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}