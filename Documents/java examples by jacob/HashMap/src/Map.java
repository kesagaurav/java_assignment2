import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Map {

	
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("gaurav","1");
		hm.put("deepa","2");
		hm.put("deepa3","22");
		
//		for(String s: hm.keySet()) {
//			System.out.println("key : " + s + " value : " + hm.get(s));
//		
//	
		Set<Entry<String,String>> set=hm.entrySet();
		
		for(Entry<String,String> me:set) {
			System.out.println(me.getKey() + ":" + me.getValue());
			
			
		
		
	}
		System.out.println();
		
	
	}
}
