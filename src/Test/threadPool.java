package Test;

import java.util.HashMap;
import java.util.Map;

public class threadPool implements Runnable{
     
     Map<String, Integer> map=new HashMap<>();
	@Override
	public void run() {
		getConn();
		
	}
	
	public int getConn(){
		int i= Pool.getConn();
		map.put(Thread.currentThread().getName(), i);
		System.out.println(Thread.currentThread().getName()+"得到"+i);
		return i;
	}
	
	public int returnConn(){
		return Pool.returnConn(map.get(Thread.currentThread().getName()));
	}

}
