
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//	String s="+";
//	s.replaceAll("+","plus");
//	System.out.println(s);


//	String str="Hello+Hello";   
//	str=str.replaceAll("\\+","plus");
//	System.out.println(str);
		
		
		String text="Portable Network Grapics";
		System.out.println(text);
		String acronym="";
		for(char c:text.toCharArray())
			if(Character.isUpperCase(c))
				acronym+=c;
		System.out.println(acronym);

	}
	

}
