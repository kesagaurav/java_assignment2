
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n hello from the main thread");
		Thread ts=new AnthorThread();
		ts.setName("anthor thread");
		ts.start();
		//ts.run();
		AnthorThread.interrupted();
		Thread myRunnable=new Thread(new MyRunnable());
		myRunnable.start();
		System.out.println();
		
		
		Thread myGaurav=new Thread(new MyRunnable());
		myGaurav.start();
//		System.out.println();
		
	
		
	}

	

}
