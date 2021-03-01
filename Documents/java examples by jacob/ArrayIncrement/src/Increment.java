import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int n,i=0;
//	        Scanner s = new Scanner(System.in);
//	        System.out.print("Enter no. of elements you want in array:");
//	        n = s.nextInt();
//	        int a[] = new int[n];
//	        //n=a.length;
//	        System.out.println("Enter all the elements:");
//	        for(i = 0; i < n; i++)
//	        {
//	            a[i] = s.nextInt();
//	            a[i]++;
//	            
//	        }
//	        System.out.print("Elements of array after increment by 1:");
//	      
//	        for(i=0;i<n-1; i++)
//	        {
//	        	
//	        	System.out.print(a[i]+",");
//	        }
//	        System.out.print(a[n-1]);
		
		
		int a[]= {1,2,3,4,5};
		int i = 2; // Second index number of the array a[]
		a[i]++;// it is incrementing the index number
		System.out.printf("%d %d\n", i, a[i]);
		a[i]=a[i++];//a[i++] increments i, not the element at index i
		System.out.printf("%d %d\n", i, a[i]);
		
		
	    }
	}


