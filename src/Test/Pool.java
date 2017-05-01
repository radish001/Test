package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pool {
       private static  List<Integer> pool=new ArrayList<>();
       
       private  static int flag=0;
	    static{
	    	for(int i=1;i<=5;i++){
	    		pool.add(i);
	    	}
	    }
	    
       
	   
       //取连接的方法
       public static int getConn(){
    	   synchronized (pool) {
    		   int i=1+new Random().nextInt(4);
       	    if(i<pool.size()&&i!=flag){
       	    	 flag=i;
       	    	 return pool.remove(i);
       	    }
       	    else{
       	    	return getConn();
       	    }
		}
    	    
    	   
       }
       //还连接
       public static int returnConn(int i){
    	   pool.add(i);
    	   return pool.size();
       }
}
