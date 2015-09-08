import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		// We need to specify the type of the key/value pairs.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// To assign key/value pairs we use the method 'put'.
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		
		// To get the value from the map we use 'get'.
		String text = map.get(7);
		System.out.println(text);
		
		// If we have two keys that are the same then the last one will override the first.
		map.put(6, "Hello");
		
		String text2 = map.get(6);
		System.out.println(text2);
		
		// Iterating through the hash:
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
		// An HashMap doesn't maintain order.
		
	}

}
