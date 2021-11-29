package week10_1;

public class AsyncRun implements Runnable { 
	@Override public void run() {
		// TODO Auto-generated method stub 
		try{
			System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId()); 
			throw new ArithmeticException(); 
		}
		catch(Exception ex){
			System.out.println("handled "+ ex);
		}
	}  
}