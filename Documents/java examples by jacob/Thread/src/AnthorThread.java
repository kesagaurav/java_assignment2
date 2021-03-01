
public class AnthorThread extends Thread {

	public void run() {
		System.out.println("\n hello from " + currentThread().getName());
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("\n anthor thread wake me up");
			return;
		}
		System.out.println("\n 3 seconds passed so  i waked up");
	}
	
	
}
