import java.util.Scanner;

public class MatrixExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,m,n;
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		int c[][]=new int[20][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter the rows of matrix");
		n=sc.nextInt();
		System.out.println("\n enter the cols of matrix");
		m=sc.nextInt();
		System.out.println("\n enter the " + (n*m)+  " values");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n the values of matrix are");
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("\n enter the row of 2nd matrix");
		n=sc.nextInt();
		System.out.println("\n enter the col of 2nd matrix");
		m=sc.nextInt();
		System.out.println("\n enter the " + (n*m)+  " values");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n the values of 2nd matrix are ");
		System.out.println("-------------------------------");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				System.out.printf("%d\t",b[i][j]);
			}
			System.out.println("\n");
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
			System.out.println("\n");
		}
		
		System.out.println("\n after the addtion the values are");
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
