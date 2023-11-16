import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Collection_Items {
	
	public static void main(String[] args) {
		
		// normal set
		Set<String> set = new HashSet<String>();
		IntStream.range(1, 10).forEach(e->set.add(e+"*1"));
		
		System.out.println("Output of normal HashSet");
		set.stream().forEach(System.out::println);
		
		// linked set
		Set<String> setA = new LinkedHashSet<String>();
		IntStream.range(1, 10).forEach(e->setA.add(e+"*1"));
		
		System.out.println("Output of LinkedHashSet");
		setA.stream().forEach(System.out::println);
		
		// tree set - implements comparable interface
		// add A
		// add a.compareTo(A) -> +ve because a>A, so order is A, a
		// add B.compareTo(A) -> +ve because B>A, and -ve because B<a so order is A, B, a
		// add Z.compareTo(A) -> +ve because Z>A, +ve because Z>B and -ve because Z<a so order is A, B, Z, a
		// add L.compareTo(A) -> +ve L>A, A-L, +ve L>B, A,B,L, -ve L<Z, A,B,L,Z,a	
		TreeSet<String> t = new TreeSet<String>();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		System.out.println("Output of TreeSet");
		t.stream().forEach(System.out::println);
		
		// Map
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("A",1);
		m.put("Z",2);
		m.put("C",3);
		
		System.out.println("Iteration of Normal Map - Doesnt Store Order");
		Iterator<Entry<String, Integer>> it = m.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> m1 = it.next();
			System.out.println(m1.getKey() +" " +m1.getValue());
		}
		
		m = new LinkedHashMap<String, Integer>();
		m.put("A",1);
		m.put("Z",2);
		m.put("C",3);
		
		System.out.println("Iteration of Linked HashMap - Stores Order");
		it = m.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> m1 = it.next();
			System.out.println(m1.getKey() +" " +m1.getValue());
		}
		
	}

}
