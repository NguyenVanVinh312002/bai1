import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App86 {

	public static void main(String[] args) {
		   HashMap<String, String> hasMap = new HashMap<>();
	        hasMap.put("CSDL", "Cơ sở lậP trình");
	        hasMap.put("C++", "C++");
	        hasMap.put("C#", "C Sharp");
	        hasMap.put("Java", "Java");

	        Set<Map.Entry<String, String> > setHashMap = hasMap.entrySet();
	        System.out.println("Các entry có trong setHashMap: ");
	        System.out.println(setHashMap);

	}

}
