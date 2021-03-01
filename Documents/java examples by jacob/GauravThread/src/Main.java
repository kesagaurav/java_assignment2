
public class Main {

	public static void main(String[] args) {

		Gaurav gaurav=new Gaurav(1,"gaurav",101);
		Client cs=new Client(1,"deepa",101,"warangal");
		ClientThread ct=new ClientThread(cs);
		gaurav1 gau=new gaurav1(gaurav);
		gau.setName("thread1");
		
		gau.start();
		System.out.println(gaurav);
		
		ct.start();
		System.out.println(cs);
		
		
		
		
	}

}
