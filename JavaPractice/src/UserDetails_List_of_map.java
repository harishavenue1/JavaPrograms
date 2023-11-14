import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserDetails_List_of_map {
	
	public static void main(String[] args)
    {
		List<Map<String, String>> li = new LinkedList<Map<String, String>>();
        Map<String, String> map;// = new Map<String, String>();
        //1st set
        for (int i=0; i<5; i++) {
            map = new LinkedHashMap<String, String>();
            map.put("Name", "Name_"+i);
            map.put("City", "City_"+i);
            map.put("Pin", "Pin_"+i);
            li.add(map);
        }
        
        li.stream().forEach(System.out::println);

        System.out.println(li.get(2).get("Name"));
        System.out.println(li.get(3).get("City"));
        System.out.println(li.get(4).get("Pin"));
    }

}
