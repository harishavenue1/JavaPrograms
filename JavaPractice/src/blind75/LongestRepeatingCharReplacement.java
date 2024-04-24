package blind75;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharReplacement {

	public static void main(String[] args) {
		int maxLen = characterReplacement("AABABBA", 2);
		System.out.println("Max length " + maxLen);
	}

	public static int characterReplacement(String s, int k) {
		Map<Character, Integer> charFreq = new HashMap<>();
		int start = 0, windowSize = 0;
		int mostFreqCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
			// We can alternatively iterate through the map to fetch the most frequent
			// character
			// which means at worst case looping through 26 times (No. of English capital
			// letters) for each character iterated
			// Here we're checking if count of current char > mostFreqCount, then we'll
			// update mostFreqCount and increase windowsize
			// Else we'll slide the window
			mostFreqCount = Math.max(mostFreqCount, charFreq.get(c));

			// Slide the window if adding this new character into the window will result in
			// window size > mostFreqCount + k
			if (windowSize + 1 > mostFreqCount + k) {
				charFreq.put(s.charAt(start), charFreq.get(s.charAt(start)) - 1); // Reduce the char freq count moving
				start++;
			}
			// Increase the window size
			else
				windowSize++;
		}
		return windowSize; // Since the window is never shrinked and has the highest size it reached at
							// some point of time
	}
}
