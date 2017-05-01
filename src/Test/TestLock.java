package Test;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
      
	
	public   static void  sayHi(){
		ReentrantLock lock=new ReentrantLock();
		synchronized (TestLock.class) {
			System.out.println("hi"+Thread.currentThread().getName());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		     for(int i=1;i<5;i++){
		    	 Thread thread=new Thread(new Runnable() {
					
					@Override
					public void run() {
						TestLock.sayHi();
						
					}
				}, "thread"+i);
		    	 
		    	 thread.start();
		     }
		     
	}
	
}

	

