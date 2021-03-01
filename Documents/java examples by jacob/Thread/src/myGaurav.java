
public class myGaurav implements Runnable {

	@Override
	public void run() {
	System.out.println("\n hello from gauarav interface");
		account();
		
	}
	
	public void account() {
		int  id=1;
		String name="gaurav";
		int accno=101;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(accno);
		
	}

}
