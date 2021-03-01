
public abstract class Food {

	
	public String name;
	boolean isCooked;
	public int cost;
	
	public Food() {
		super();
		cost=0;
		System.out.println("in abstract constructor");
	}
	
	
	abstract void goBad();
	
	void concreteMethod() {
		System.out.println("this is fine");
	}
	
	static void method2() {
		
	}
}
