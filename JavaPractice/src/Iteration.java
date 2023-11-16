import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class Iteration {
	
	public static void main(String[] args) {
		
		// Iterator
		// only forward and removal
		List<Integer> li = new LinkedList<>();
		IntStream.range(1, 10).forEach(e->li.add(e));
		li.stream().forEach(System.out::println);
		
		System.out.println("is list before");
		
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			if (it.next() %2 ==0)
				it.remove();
		}
		li.stream().forEach(System.out::println);
		
		System.out.println("is list after");
		
		//------------------------------------------------
		
		//ListIterator
		//Forward - Backward, removal and replacement
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		System.out.println("before replacement");
		ll.stream().forEach(System.out::println);
		
		ListIterator<String> lit = ll.listIterator();
		String s = "";
		while(lit.hasNext()) {
			s = lit.next();
			if(s.equals("A"))
				lit.set("D");
			else if (s.equals("D"))
				lit.set("A");
		}
		
		System.out.println("after replacement");
		ll.stream().forEach(System.out::println);
	}

}
