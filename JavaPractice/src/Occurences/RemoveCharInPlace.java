package Occurences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveCharInPlace {

	public static void main(String[] args) {
		
		main2(args);
		
	}
	
	// RemoveCharInPlace
	public static void main1(String[] args) {
		String chars = "harish";
		StringBuilder sb = new StringBuilder(chars);
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
	}
	
	// remove duplicate char in string
	public static void main2(String[] args) {
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> set = new HashSet<>();
		int len = 0;
		for (char c : chars)
		    if (set.add(c))
		        chars[len++] = c;

		System.out.println(new String(chars, 0, len));   // abcdeftz
	 	System.out.println(set.stream().map(String::valueOf).collect(Collectors.joining())); // abcdeftz
	 	
	}
	
	// remove duplicate char in string - way2
	public static void main3(String[] args) {
		String string = "aabbccdefatafaz";
		string = Arrays.asList(string.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(string);
	}
	
}


