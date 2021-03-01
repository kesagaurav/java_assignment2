import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i,j,n,prime=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n enter value for n");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				prime=0;
				break;
			}
		}
		if(prime==1)
			System.out.printf("\n prime number is : %d",i);
		prime=1;
	}
	
	
	}

}
