package Test;



public class testPool {
          public static void main(String[] args) {
			  for(int i=1;i<=5;i++){
				  threadPool threadPool=new threadPool();
				  Thread thread=new Thread(threadPool);
				  thread.start();
			  }
		}
}
