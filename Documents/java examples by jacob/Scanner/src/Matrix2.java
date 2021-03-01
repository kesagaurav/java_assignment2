import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row,col,i,j,m,n,row1,col1;
		int a[][] =new int[10][10];
		int b[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter the row elements");
		row=sc.nextInt();
		System.out.println("\n enter the col elements");
		col=sc.nextInt();
		System.out.println("Enter " +(row*col)+ " Array Elements : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\n the Arryay is");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n enter the second row elements");
		row1=sc.nextInt();
		System.out.println("\n enter the second col elements");
		col1=sc.nextInt();
		System.out.println("Enter " +(row1*col1)+ " Array Elements : ");
		for(m=0;i<row1;m++)
		{
			for(n=0;n<col1;n++)
			{
				 b[m][n]=sc.nextInt();
			}
		}
		
		System.out.println("\n the Arryay is");
		
		for(m=0;i<row1;m++)
		{
			for(n=0;n<col1;n++)
			{
				System.out.println(b[m][n] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
