
public class inti {

	int x;// in this what happens is we can declare a an attribute 
	//and pass the value to the attribute
	

	int y=40;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	/*
	 *  so in this what happens when we wnat to access the value in the atrribute
	 *  it will get error so to avoid the error you should declare the class
	 *  object and set the object to the attribute which is shown below which is
	 *  we have created an class object and pass the object to the attribute using dot
	 *  operator
	 *  and the(.) operator used to access object's atrributes and methods
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(10);// so in this we can declare the value
		
		inti obj=new inti();
		System.out.println(obj.y);
		System.out.println(inti.class);
		

		
	}

}
