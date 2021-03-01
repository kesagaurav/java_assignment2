
public class Pineapple extends Food implements Chewable {
	
	public Pineapple() {
		System.out.println("\n in pineapple constructor");
		this.name="Pineapple";
	}
	
	
	@Override
	void goBad() {
		System.out.println("this is smelly");
	}

	

	@Override
	public void digest() {
		System.out.println("sfhufsnujsbuhirhbrsuih food");
	}

//	@Override
//	public void anthorMethod()
//	{
//		System.out.println("\n ok");
//	}
	
}
