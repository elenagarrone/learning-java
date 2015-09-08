import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {

		// HashMap doesn't store any particular order.
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// If we want to have an ordered hash:
		// - LinkedHashMap: it differs from HashMap in that it maintains a doubly-linked list running through all of its entries. This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map; 
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		// - TreeMap: It's sorted according to the natural ordering of its keys. Integers' natural order is 1, 2, 3, 4, etc. while strings' is by alphabetical order.
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		/*Since all of the three examples above refers to the Map interface, I can also write:
		 * Map<Integer, String> hashMap = new HashMap<Integer, String>();
		 * Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		 * Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		 */
		
		
		System.out.println("\n----- HashMap -> no guaranteed order -----");
		testMap(hashMap); 
		
		System.out.println("\n----- LinkedHashMap -> ordered as key were inserted -----");
		testMap(linkedHashMap); 
		
		System.out.println("\n----- TreeMap -> natural order -----");
		testMap(treeMap); 
	}
	
	// All the three implementations refer to an interface called Map.
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bird");
		map.put(6, "snake");
		
		// Another way of iterate through a map (I can iterate through the keys and then get the values):
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
		
		
		
	}

}
