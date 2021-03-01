import java.util.Scanner;

public class MatrixOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,m,n;
		int a[][]=new int[20][20];
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
				if(a[i][j]%2!=0)
				{
					System.out.printf("\n the odd are %d",a[i][j]);
				}
//				if(a[i][j]>0)
//				{
//					System.out.printf("\n the min are %d",a[i][j]);
//				}
			}
			
		}
	}

}
