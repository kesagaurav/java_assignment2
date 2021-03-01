import java.util.Scanner;

public class SumOfEachRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,m,n,sum=0;
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter the rows of matrix");
		n=sc.nextInt();
		
		System.out.println("\n enter the " + (n)+  " values");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		
		System.out.println("\n the values of matrix are");
		
		for(i=0;i<n;i++) {
			sum+=a[i];
			System.out.println(sum);
		}

}
	}

