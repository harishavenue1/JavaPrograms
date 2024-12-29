package examples;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SumAvgMode_intArray {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 9, 5, 2, 6, 8, 5, 2}; // Sample array
        
        // Calculate sum
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);
        
        // Calculate average
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Average: " + average);
        
        // Calculate mode
        int mode = calculateMode(numbers);
        System.out.println("Mode: " + mode);
    }
    
    public static int calculateMode(int[] array) {
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        
        return frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
