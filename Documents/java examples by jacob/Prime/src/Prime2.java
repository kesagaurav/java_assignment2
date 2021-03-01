import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n,count=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter n value");
		n=sc.nextInt();
		
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
			
			if(count==0)
			{
				System.out.printf("\n is a prime %d",n);
			}
			else {
				System.out.printf("\n not a prime %d",n);
			}
		
		
		
		
	}

}
