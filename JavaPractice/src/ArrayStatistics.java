import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayStatistics {

	public static void main(String[] args) {
		float[] numbers = { 5.5f, 2.3f, 7.8f, 9.1f, 5.5f, 2.3f, 6.7f, 8.4f, 5.5f, 2.3f }; // Sample array

		// Convert float array to list of Float
		double[] ds = IntStream.range(0, numbers.length).mapToDouble(i -> numbers[i]).toArray();

		// Calculate sum
		double sum = Arrays.stream(ds).sum();
		System.out.println("Sum: " + String.format("%.2f",sum));

		// Calculate average
		double average = Arrays.stream(ds).average().orElse(0);
		System.out.println("Average: " + String.format("%.2f",average));

		// Calculate mode
		double mode = calculateMode(ds);
		System.out.println("Mode: " + String.format("%.2f",mode));
	}

	public static Double calculateMode(double[] numbers) {
		Map<Double, Long> frequencyMap = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		return frequencyMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
	}
}
