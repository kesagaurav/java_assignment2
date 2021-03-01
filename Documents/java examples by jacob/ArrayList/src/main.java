import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> al=new ArrayList<>();
		al.add("kesa");
		al.add("gaurav");
		al.add("deepa");
		al.add("omkar");
		Collections.sort(al); // sort al
		for(String i:al)
		System.out.println(i);
		//Collections.sort(al); // sort al
//		for(int i=0;i<al.size();i++)
//			System.out.println(al.get(i));
//	
	}

}
