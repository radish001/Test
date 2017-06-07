package TestException;
/**
 * @description
 * @author      胡晓东
 * @date        2017年5月25日下午3:05:58
 */
public class TestMyException {
        public static void main(String[] args) {
        	
        	TestMyException exception=new TestMyException();
        	try {
					exception.test();
				} catch (Throwable e) {
					System.out.println(e.getMessage());
					System.out.println(e.getCause());
				}
        	}
        	
       



   public void test() throws Throwable{
	   try {
		   int i=1/0;
	} catch (Exception e) {
		throw new MyException("出现异常").initCause(e);
	}
	 
   }

}
