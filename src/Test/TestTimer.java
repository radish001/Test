package Test;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
        public static void main(String[] args) {
			Timer timer=new Timer();
			timer.schedule(new MyTask(), 5000, 2000);
		
        }
}

 class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("定时任务执行");
		
		
	}
	 
 }
