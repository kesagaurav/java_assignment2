
public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="gaurav";
		char ch1=s.charAt(5);
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		
		String s2="gaurav";
		//s2.charAt(1);
		System.out.println(s2.toUpperCase().charAt(0));
		
		
		String a="gaurav";
		String b="deepa";
//		char[] array=a.toCharArray();
//		char[] array1=b.toCharArray();
//		
//	int c=a.length()+b.length();
//		System.out.println(c);
		
		System.out.println(a.length() + b.length());
		
System.out.println(a.length()>b.length() ?("YES"):("NO"));
		
		
//		
//		if(a.charAt(0)>b.charAt(0)) {
//			System.out.println("no");
//		}else {
//			System.out.println("true");
//		}
//		
		
		
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + "" +b.substring(0,1).toUpperCase() + b.substring(1)); 
		
		
	}

}
