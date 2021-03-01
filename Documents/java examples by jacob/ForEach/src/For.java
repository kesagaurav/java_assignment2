import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter a value");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.printf("\n enter nos %d",n);
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		
		for(int i : a) {
			
			sum+=i;
}
		avg=sum/n;
		System.out.printf("\t sum is %d",sum);
		System.out.printf("\t avg is %f",avg);
		sc.close();
			
	}

}
