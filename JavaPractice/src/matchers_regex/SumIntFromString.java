package matchers_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumIntFromString {

	public static void main(String[] args) {
		
		String str = "T35tin9 5hastra";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str);
		
		int res = 0;
		while(m.find()) {
			res += Integer.valueOf(m.group());
		}
		System.out.println("Sum "+ res);
		
		
	}
}
