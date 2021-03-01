import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
	System.out.println("\n hello from the runnable interface");
	add();
	}
	
	public synchronized void add() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a number");
		a=sc.nextInt();
		System.out.println("\n enter b number");
		b=sc.nextInt();
		c=a+b;
		System.out.println("c="+ c);
		
		
		
	}

}
