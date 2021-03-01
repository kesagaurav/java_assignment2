import java.util.Scanner;

public class ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
//		Scanner sc=new Scanner("Hello World!");
//		
//		System.out.println("Delimeter:" + sc.delimiter());
//		
//		while(sc.hasNext())
//			System.out.println(sc.next());
//		
//		sc.close();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a string");
		str=sc.nextLine();
		System.out.println("Delimeter:" + sc.delimiter());
		while(sc.hasNext())
			System.out.println(sc.next());
		System.out.println("\n you entered a string : " + str);
		
		
	}

}
