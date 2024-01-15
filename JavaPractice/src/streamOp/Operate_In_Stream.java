package streamOp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operate_In_Stream {
	
	public static void main(String[] args) {
		
		// convert integer to string during stream range
		List<String> li = IntStream
							.range(1, 10)
							.mapToObj(e->String.valueOf(e))
							.collect(Collectors.toList());
		
        li.forEach(System.out::println);
        
	}

}
