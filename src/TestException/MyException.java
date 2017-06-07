package TestException;

/**
 * @description
 * @author 胡晓东
 * @date 2017年5月25日下午3:02:31
 */
public class MyException extends Exception {
	public MyException() {
		super();
	}
	
	public MyException(String msg){
	    super(msg);
	}
	
	public MyException(String msg,Throwable cause){
	    super(msg, cause);
	}
}
