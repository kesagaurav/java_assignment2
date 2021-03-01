
public class Test<T,U> {

	T obj;
	U obj2;

	public Test(T obj,U obj2) {
		super();
		this.obj = obj;
		this.obj2 = obj2;
	}

//	public T getObj() {
//		return obj;
//	}
//
//	public void setObj(T obj) {
//		this.obj = obj;
//	}
//
//	public U getObj2() {
//		return obj2;
//	}
//
//	public void setObj2(U obj2) {
//		this.obj2 = obj2;
//	}
//	
//	

	 public void print() 
	    { 
	        System.out.println(obj); 
	        System.out.println(obj2); 
	    } 
	 
	 
	 
	 static <T> void display(T element) {
		 System.out.println(element.getClass().getName() + 
                 " = " + element);
	 }

}
