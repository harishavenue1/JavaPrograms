package replace;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharReplaceInStringWithInt {

	public static void main(String[] args) {
        String inputString = "tomorrow";
        StringBuilder result = new StringBuilder();
        int replacementCount = 1;
        for (char c : inputString.toCharArray()) {
            if (c == 'o') {
                result.append(IntStream.range(1,++replacementCount)
//                		.mapToObj(Integer::toString)
                		.mapToObj(e->String.valueOf(e))
                		.collect(Collectors.joining("")));
//                replacementCount += 1;
            } else {
                result.append(c);
            }
        }
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + result.toString());
    }
}
