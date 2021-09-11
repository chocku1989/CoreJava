package com.training.thread;

public class ThreadLearning extends Thread{
	
	public void run() {
		//Thread.sleep(3000);
		
		System.out.println("thread is running");
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadLearning t1 = new ThreadLearning();
		t1.start();
		ThreadLearning t2 = new ThreadLearning();
		t2.start();
		
//		t2.join();
//	//	Thread.sleep(3000);
//		Thread.yield();
		System.out.println("after start");
		System.out.println(Thread.currentThread());
	
	}

}
