package in.ashokit;

public class MultiThrading {
   
	public static void main(String[] args) {
		
	
       ThreadExample t = new ThreadExample();
       t.start();
       
       ThreadExample t1 = new ThreadExample();
       t1.start();
       
       ThreadExample t2 = new ThreadExample();
       t1.start();
	
       
       
	}
}
