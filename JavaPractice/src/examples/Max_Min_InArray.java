package examples;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Max_Min_InArray {

	public static void main(String[] args) {

		int[] arr = { 64, 1, 3, 4, 5, 63, 7, 1, 2 };

		// way1
		Arrays.sort(arr);
		System.out.println("max " + arr[arr.length - 1]);

		// way2
		arr = new int[] { 64, 1, 3, 4, 5, 63, 7, 1, 2 };
		int max = 0;
		for (int x : arr) {
			if (x > max)
				max = x;
		}
		System.out.println("max " + max);

		// way3
		max = Collections.max(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		System.out.println("max " + max);

		// find max diff
		int slow = 0, fast = 1, maxDiff = 0;
		while (fast < arr.length) {
			if (arr[fast] > arr[slow]) {
				maxDiff = Math.max(maxDiff, (arr[fast] - arr[slow]));
			} else {
				slow=fast;
			}
			fast++;
		}
		System.out.println("maxDiff " + maxDiff);
	}

}
