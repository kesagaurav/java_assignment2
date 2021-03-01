import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;



public class Main {

	public static final String EOF="EOF";
	
	public static void main(String[] args) {
		
	List<String> buffer=new ArrayList<String> ();
	ReentrantLock rl=new ReentrantLock();
	MyProducer producer=new MyProducer(buffer,ThreadColor.ANSI_GREEN,rl);
	MyConsumer consumer=new MyConsumer(buffer,ThreadColor.ANSI_BLACK,rl);
	MyConsumer consumer1=new MyConsumer(buffer,ThreadColor.ANSI_RED,rl);
	
		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(consumer1).start();
		
		
	}

}



class MyProducer implements Runnable{
	
	private List<String> buffer;
	private String color;
	private ReentrantLock rl;
	public MyProducer(List<String> buffer, String color,ReentrantLock rl) {
		super();
		this.buffer = buffer;
		this.color = color;
		this.rl=rl;
	}
	@Override
	public void run() {
		Random random=new Random();
		String[] nums= {"1","2","3","4","5"};
		
		for(String num:nums) {
			try {
				System.out.println(color + "Adding" + num);
				rl.lock();
				buffer.add(num);
				rl.unlock();
				Thread.sleep(random.nextInt(1000));
			}catch(Exception e) {
				System.out.println("\n producer has intreeputed");
			}
			
			buffer.add("EOF");
		}
	}
}
	
	
	class MyConsumer implements Runnable{
			public List<String> buffer;
			private String color;
			private ReentrantLock rl;
			
			
			public MyConsumer(List<String> buffer, String color,ReentrantLock rl) {
				super();
				this.buffer = buffer;
				this.color = color;
				this.rl=rl;
			}



			@Override
			public void run() {
					while(true) {
						if(buffer.isEmpty()) {
							continue;
						}
						
						if(buffer.get(0).equals("EOF")) {
							System.out.println(color + "esisting");
						}else {
							System.out.println(color + "removed" + buffer.remove(0));
						}
					}
			}
			
		}
	
	
	
