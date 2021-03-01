import java.util.Scanner;



public class Addtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,n;
		int[] a=new int[10];
		
				Scanner sc=new Scanner(System.in);
		System.out.println("\n enter how many nos U wnat to input");
		n=sc.nextInt();
		System.out.printf("\n enter nos %d",n);
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			sum+=a[i];
		
		float avg=sum/n;
		System.out.printf("\t the sum is %d", sum);
		System.out.printf("\t the avg is %f", avg);
		
		sc.close();
		
	}

}

