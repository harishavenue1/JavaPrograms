import java.util.*;
import java.util.stream.Collectors; 
  
class ArrayToListToMap { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Creating a list of Strings 
    	String[] arr = {"3", "6", "8", "14", "15" };
    	
    	// #1
        List<String> list = Arrays.asList(arr); 
  
        // #2
        list = Arrays.stream(arr).collect(Collectors.toList());
        
        // #3
        Collections.addAll(list, arr);
        
        // #4
        list = new ArrayList<>(Arrays.asList(arr));
        
        // #5
        list = List.of(arr);
        
        // Using Stream mapToInt(ToIntFunction mapper) 
        // and displaying the corresponding IntStream 
        list.stream().mapToInt(num -> Integer.parseInt(num)) 
                     .filter(num -> num % 3 == 0) 
                     .forEach(System.out::println); 

      // Creating a list of Strings 
        list = Arrays.asList("Geeks", "for", "gfg", 
                                          "GeeksforGeeks", "GeeksQuiz"); 
  
        // Using Stream mapToInt(ToIntFunction mapper) 
        // and displaying the corresponding IntStream 
        // which contains length of each element in 
        // given Stream 
        list.stream().mapToInt(str -> str.length()).forEach(System.out::println); 
    } 
}
