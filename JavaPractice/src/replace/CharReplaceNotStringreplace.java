package replace;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CharReplaceNotStringreplace {

	public static void main(String[] args) {
		String s = "tomorrow";
		List<Character> li = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		ListIterator<Character> lit = li.listIterator();
		while (lit.hasNext()) {
			if (lit.next() == 'o') {
				lit.set('&');
			}
		}
		li.forEach(System.out::print);
	}
}
