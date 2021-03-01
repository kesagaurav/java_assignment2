package ok;

public class b {
	public static boolean isLuhn(String string) {
		 string="14539148803436467";
		boolean second= false;
		int sum=0;
		int n=string.length();
		
		for(int i=n-1;i>=0;i--)
		{
			int d=string.charAt(i)-'0';
			if(second==true)
				d=d*2;
			sum+=d/10;
			sum+=d%10;
			second=!second;
		}	
		return (sum%10==0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string=" 14539148803436467";
		if(isLuhn(string))
			System.out.println("valid");
		else
			System.out.println("not valid");
		
	}	
	
	}


