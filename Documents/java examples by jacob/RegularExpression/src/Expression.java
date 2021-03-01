import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * the matches() strict equals will return true only if the pattern and inputsequence(matcher) are equal
 * otherwise false
 */
		
		Pattern pat=Pattern.compile("gaurav");//pattern
		Matcher mat=pat.matcher(" k gaurav");//input sequnece
		boolean matchFound=mat.matches();
		if(matchFound) {
			System.out.println("yeah super");
		}else {
			System.out.println("ohh sorry plz try again");
		}
		
		
		
	}

}
