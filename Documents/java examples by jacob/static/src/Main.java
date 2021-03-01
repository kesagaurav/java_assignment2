
public class Main {

//		int x=2,y=5;
//		 int z;
////		 int display(){
////			 System.out.println("\n z="+z);
////			 return 0;
////		 }
//	
//	static int a=10;
//	public static void B()
//	{
//		int b;
//		a=b=10;
//		System.out.println("\n show of a =" +b);
//	}
	
//	
//	
	
	
	public int x;
	private void setx(int b)
	{
		x=b;
	}
	private void print()
	{
		System.out.println("\n x="+x);
	}
	
	
	
	
	
	private int accno;
	private String name;
	private void setbank(String name,int accno)
	{
		
		this.name=name;
		this.accno=accno;
	}
	
	private void show()
	{
		System.out.println("\n name=" + name + "\n accno="+ accno);
	}
	
	
	
	
	
	
	public static  void main(String []args) {
		// TODO Auto-generated method stub

		Main m=new Main();
		//System.out.println(112.3333);
//		System.out.println(m.display());
		m.setx(2);
		m.print();
		m.setbank("gaurav", 101);
		m.show();
	
	}

}
