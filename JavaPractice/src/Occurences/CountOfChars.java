package Occurences;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfChars {
	
	public static void main(String[] args) {
		
		String s = "HarisHa";
		
		// using filter of stream
		System.out.println("Using Stream Filter");
		String seen = "";
		for(char c: s.toCharArray()) {
			// to avoid repeating count for same char again, check if already validated
			if (seen.indexOf(c) != -1) { // IMP - if present it gives index, else -1
				System.out.println("Already Validated Char " + c + " -> Present at Index -> "+ seen.indexOf(c) + " hence skipping check");
				continue;
			}
			System.out.println("Char -> "+ c +" repeated "+ s.chars().filter(ch -> ch == c).count());
			seen += c; // store to avoid repeatition
		}
		
		System.out.println("------");
		
		// using maps
		System.out.println("Using Map");
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c: s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else 
				map.put(c, 1);
		}
		map.entrySet().stream().forEach(System.out::println);
	}

}
