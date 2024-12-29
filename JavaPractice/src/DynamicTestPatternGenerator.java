import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicTestPatternGenerator {

    public static void main(String[] args) {
        // Input for the base string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base string (e.g., LOYALTY): ");
        String baseString = scanner.nextLine();

        List<String> patterns = new ArrayList<>();

        // Generate patterns
        patterns.add(baseString);  // Exact input
        patterns.add(baseString.toLowerCase());  // Lowercase
        patterns.add(mixedCase(baseString));  // Mixed case
        patterns.add(alphanumericMaxLength(baseString));  // Alphanumeric max length
        patterns.add(replaceLookalikeNumbers(baseString));  // Numbers replacing lookalike letters
        patterns.add(encodeHexadecimal(baseString));  // Hexadecimal representation
        patterns.add(baseString + "12345");  // Exceeding max length
        patterns.add(baseString + "@");  // Special character at the end
        patterns.add(" " + baseString);  // Leading whitespace
        patterns.add(baseString + " ");  // Trailing whitespace
        patterns.add(" " + baseString + " ");  // Whitespace around

        // Negative Cases with index-based invalid character substitutions
        patterns.add(replaceAtIndex(baseString, 1, '#'));  // Index 1 (O) replaced with #
        patterns.add(replaceAtIndex(baseString, 4, '@'));  // Index 4 (Y) replaced with @
        patterns.add(replaceAtIndex(baseString, 0, '%'));  // Index 0 (L) replaced with %
        patterns.add(replaceAtIndex(baseString, 2, '$'));  // Index 2 (A) replaced with $
        patterns.add(replaceAtIndex(baseString, 5, '&'));  // Index 5 (T) replaced with &
        patterns.add(replaceAtIndex(baseString, 3, '*'));  // Index 3 (A) replaced with *
        patterns.add(baseString + "!");  // Special char at boundary
        patterns.add("!" + baseString + "!");  // Special characters around the string
        patterns.add("");  // Empty input

        // Edge Cases
        patterns.add(baseString.substring(0, 1));  // Minimum valid input
        patterns.add(alphanumericWithMaxLength(baseString));  // Boundary alphanumeric with max length
        patterns.add(allSpecialCharacters());  // All special characters
        patterns.add(numericBoundary());  // Numbers only within boundary
        patterns.add(hexAndSpecialCharacters(baseString));  // Hex, letters, and special characters
        patterns.add(replaceWithHexadecimal(baseString));  // Replace characters with their hex codes
        
        // Print patterns
        System.out.println("Generated Test Patterns:");
        for (String pattern : patterns) {
            System.out.println(pattern);
        }
        
        scanner.close();
    }

    // Generate mixed case pattern
    private static String mixedCase(String str) {
        StringBuilder mixed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                mixed.append(Character.toUpperCase(str.charAt(i)));
            } else {
                mixed.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return mixed.toString();
    }

    // Generate an alphanumeric max length pattern
    private static String alphanumericMaxLength(String str) {
        return str + "123";  // Example alphanumeric pattern
    }

    // Replace letters with lookalike numbers
    private static String replaceLookalikeNumbers(String str) {
        return str.replace('O', '0').replace('A', '4').replace('Y', '7');  // Example replacements
    }

    // Generate hexadecimal representation
    private static String encodeHexadecimal(String str) {
        StringBuilder hexBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            hexBuilder.append("\\x").append(String.format("%02X", (int) c));
        }
        return hexBuilder.toString();
    }

    // Replace character at a specific index
    private static String replaceAtIndex(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            return str; // Return original string if index is out of bounds
        }
        StringBuilder modified = new StringBuilder(str);
        modified.setCharAt(index, replacement); // Replace character at the specified index
        return modified.toString();
    }

    // Generate whitespace variant
    private static String whitespaceVariant(String str) {
        return str.replace("L", "L ");  // Example whitespace insertion
    }

    // Generate alphanumeric with max length
    private static String alphanumericWithMaxLength(String str) {
        return str + "123";  // Example
    }

    // Generate a string with all special characters
    private static String allSpecialCharacters() {
        return "@$%^&*!";  // Example of all special characters
    }

    // Generate a numeric boundary
    private static String numericBoundary() {
        return "1234567";  // Example numbers within boundary
    }

    // Combine hex and special characters
    private static String hexAndSpecialCharacters(String str) {
        return encodeHexadecimal(str) + "@!";  // Example combination
    }

    // Replace characters with their hex codes
    private static String replaceWithHexadecimal(String str) {
        StringBuilder hexBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            hexBuilder.append(String.format("\\x%02X", (int) c));
        }
        return hexBuilder.toString();
    }
}
