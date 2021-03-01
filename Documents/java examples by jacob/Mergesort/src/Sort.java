
public class Sort {

	private int[] array;
	private int[] tempMergeArr;
	int length;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {48,36,13,52,19,21};
		 Sort s=new Sort();
		s.sort(arr);
		for(int i:arr) {
			System.out.println(i + " ");
		}

	
	}
	
	public void sort(int arr[]) {
	
		array=arr;
		length=arr.length;
		tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	
	
	
	public void divideArray(int lower,int higher) {
		if(lower<higher) {
			int middle=lower+(higher-lower)/2;
			// will sort for the left side of array
			divideArray(lower,middle);
			//it will sort the right side of array
			divideArray(middle+1,higher);
			
			mergeArray(lower,middle,higher);
		}
	}
	
	
	public void mergeArray(int lower,int middle,int higher) {
		for(int i=0;i<=higher;i++) {
			tempMergeArr[i]=array[i];
		}
		
		int i=lower;
		int j=middle+1;
		int k=lower;
	
		while(i<=middle && j<=higher) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k]=tempMergeArr[i];
				i++;
			}else {
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle) 
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	
	}
	
	
	
	

}
