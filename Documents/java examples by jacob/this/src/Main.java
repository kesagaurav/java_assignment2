
public class Main {

	private String name;
	private int accno;
//	

	public Main(String name, int accno) {
	//super();
	this.name = name;
	this.accno = accno;
	
}
	
	
	
	
	
	

	public void setbank(String name,int accno) {
		this.name=name;
		this.accno=accno;
		
	}
	


	public void showbank() {
		System.out.println("\n name=" + name + "" +  "accno=" + accno);
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj=new Main("gaurav2",102);
			obj.setbank("gaurav1", 1101);
			System.out.println(obj instanceof Main);
			obj.showbank();
	
		
	}

}
