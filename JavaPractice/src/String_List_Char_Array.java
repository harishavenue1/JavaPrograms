import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class String_List_Char_Array {
	
	public static void main(String[] args) {
		
		//string to list
		String var = "This is Harish";
		List<String> vlist = Arrays.asList(var.split(" "));
		vlist.stream().forEach(e->System.out.println(e));

		System.out.println("------1");
		
		//string to charList
		var = "Harish";
		List<Character> chList = var.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		chList.stream().forEach(System.out::println);
		
		System.out.println("------2");
		
		var = "ThisisHarish";
		List<String> var1 = Arrays.asList(var.split(""));//.stream().forEach(e->System.out.println(e));
		var1.stream().forEach(System.out::println);
		
		System.out.println("------3");
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<var1.size(); i++) {
			sb.append(var1.get(i));
		}
		System.out.println(sb.toString());
		System.out.println("------4");
		
		System.out.println(String.join("", var1));
	}

}
