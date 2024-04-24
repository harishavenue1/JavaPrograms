package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class countpair {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int[] ary = { 1, 1, 1, 1, 1, 2, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>(ary.length);
		for (int i : ary) {
			list.add(i);
		}
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (Integer str21 : list) {
			hmap.put(str21, Collections.frequency(list, str21));
		}

		for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
			int counter = entry.getValue();
			System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times");
		}
	}
}
