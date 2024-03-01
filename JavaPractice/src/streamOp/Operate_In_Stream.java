package streamOp;

import java.util.*;
import java.util.stream.*;

public class Operate_In_Stream {
	
	public static void main(String[] args) {
		
		// convert integer to string during stream range
		List<String> li = IntStream
							.range(1, 10)
							.mapToObj(String::valueOf)
							.collect(Collectors.toList());
		
        li.forEach(System.out::println);
        
	}

}
