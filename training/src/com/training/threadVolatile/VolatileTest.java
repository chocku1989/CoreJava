package com.training.threadVolatile;
public class VolatileTest extends Thread{
//  volatile boolean keepRunning = true;
	  volatile boolean keepRunning = true;
	  volatile  int count =1;
	  
   
		    public void run() {
		        int count=0;
//		        while (keepRunning) {
//		        	System.out.println(count);
//		            count++;
//		           
//		        }
		        try {
					increment();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        System.out.println("Thread terminated."+count);
		    }
		    
		    public void increment() throws InterruptedException {
				synchronized (this) {
					count++; // count = count + 1;
					System.out.println(Thread.currentThread() +" "+count);
				}
				
				

			}


		    public static void main(String[] args) throws InterruptedException {
		    	VolatileTest t = new VolatileTest();
		    	   t.count=2;
		        t.start();
		     
		        VolatileTest t1 = new VolatileTest();
		        t1.start();
		        Thread.sleep(1000);
		        t.keepRunning = false; // updated in heap(RAM)
		        System.out.println("keepRunning set to false.");
		        System.out.println(t.count);
		    }
		

}
