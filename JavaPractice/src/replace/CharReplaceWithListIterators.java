package replace;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CharReplaceWithListIterators {
	
	public static void main(String[] args)
    {
        String s = "tomorrow";
        List<String> li = Arrays.asList(s.split(""));
        ListIterator<String> lit = li.listIterator();
        int count=1;
        while(lit.hasNext()) {
            if (lit.next().equals("o")) {
                lit.set("%".repeat(count++));
            }
        }
        li.forEach(System.out::print);
    }

}
