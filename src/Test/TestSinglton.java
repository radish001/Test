package Test;

public class TestSinglton {
	    private String  name;
        private static TestSinglton test=null;
        private TestSinglton(){
        	
        }
        
        public static TestSinglton getInstance(){
        	if(test==null){
        		return new TestSinglton();
        	}
        	else{
        		return test;
        	}
        	
        }
        
       public static void main(String[] args) {
		    TestSinglton test1=new TestSinglton();
		    
		    TestSinglton test2=new TestSinglton();
		    System.out.println(test1==test2);
	} 
        
}
