package week10_1;

public class Main {
	
	public static void main( String[] args ) {
		try { 
			Thread t = new Thread(new AsyncRun());
			t.start(); 
			System.out.println( "main on thread " + Thread.currentThread().getId());
			throw new NullPointerException(); 
			} 
		catch(Exception ex) { 
			System.out.println(ex.getClass().getName() + " handled");
			} 
	}
}
