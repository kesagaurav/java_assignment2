import java.util.HashMap;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hm=new HashSet<String>();
//		hm.add("gaurav");
//		hm.add("cp");
//		hm.add("job");
//		System.out.println(hm.contains("deepa"));
//		System.out.println(hm.contains("gaurav"));
//		System.out.println(hm.remove("cp"));
		
		HashSet<Integer> hm=new HashSet<Integer>();
		hm.add(1);
		hm.add(2);
		hm.add(3);
		hm.add(4);
		hm.add(5);
		
		for(int i=1;i<=7;i++) {
			if(hm.contains(i)){
				System.out.println(i + " they are in the set");
			}else {
				System.out.println(i + " they are not  in the set");

			}
		}
	}

}
