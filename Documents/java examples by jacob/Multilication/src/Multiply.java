import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,result;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("\n enter n value");
		for(i=1;i<=15;i++) {
			result=n*i;
			System.out.printf("\n the result is%d",result);
		}
	
	
	}

}
