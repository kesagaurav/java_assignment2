
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countDown countdown=new countDown();
		CountDownThread t1=new CountDownThread(countdown);
		t1.setName("Thread 1");
		CountDownThread t2=new CountDownThread(countdown);
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
		
		
	
	}
	

}


class countDown {
	public synchronized void doCountdown() {
		String color;
		switch(Thread.currentThread().getName()) {
		case "Thread 1":
			color=ThreadColor.ANSI_CYAN;
			break;
		case "Thread 2":
			color=ThreadColor.ANSI_PURPLE;
			break;
			
			default:
				color=ThreadColor.ANSI_GREEN;
		
		}
		
		for(int i=10;i>0;i--) {
			System.out.println(color + Thread.currentThread().getName() + ":i=" + i);
			
		}
	}
}


class CountDownThread extends Thread{
	private countDown threadcountdown;

	public CountDownThread(countDown countdown) {
		threadcountdown = countdown;
	}
	
	
	public void run() {
		threadcountdown.doCountdown();
	}
	
	
	
}

