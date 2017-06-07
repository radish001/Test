package TestStatic;

import java.awt.event.FocusAdapter;
import java.util.concurrent.CountDownLatch;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * @description
 * @author      胡晓东
 * @date        2017年5月26日上午10:39:00
 */
public class Test {
         public static void main(String[] args) {
        	 Test test=new Test();
        	 CountDownLatch latch=new CountDownLatch(2);
			Thread th1=new Thread(test.new AddThread(latch));
			Thread th2=new Thread(test.new SubThread(latch));
			th1.start();
			th2.start();
			try {
				latch.await();
			} catch (InterruptedException e) {
			
			}
			System.out.println(TestStatic.num);
        	 
		}
         
         
      class AddThread implements Runnable{
        	private CountDownLatch latch;    	
			public AddThread(CountDownLatch latch) {
				this.latch=latch;
			}
    		@Override
    		public void run() {
    			for(int i=0;i<100;i++){
    				
    				TestStatic.add();	
    				System.out.println("AddThread启动");
    			}
    			 
    				latch.countDown();
    		}
        }
        
        
       class SubThread implements Runnable{
    	   private CountDownLatch latch;
    	   public SubThread(CountDownLatch latch) {
				this.latch=latch;
			}
    	    
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					
				    TestStatic.sub();
				    System.out.println("SubThread启动");
				}
				    
				    latch.countDown();
				
			}
        	
        }

		
}
