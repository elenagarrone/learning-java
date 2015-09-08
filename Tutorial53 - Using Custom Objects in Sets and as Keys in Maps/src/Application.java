import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "{ID is: " + id + " -- Name is: " + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Application {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		// As said in the previous tutorial the keys are unique so "one" is not repeated.
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("cat");
		
		System.out.println(set);
		
		
		// Adding our custom element to a set:
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> map2 = new LinkedHashMap<Person, Integer>();
		
		map2.put(p1, 1);
		map2.put(p2, 2);
		map2.put(p3, 3);
		map2.put(p4, 1);
		
		for(Person key: map2.keySet()) {
			System.out.println(key + ": " + map2.get(key));
		}
		
		Set<Person> set2 = new LinkedHashSet<Person>();
		
		set2.add(p1);
		set2.add(p2);
		set2.add(p3);
		set2.add(p4);
		
		System.out.println(set2);
		
		// Map and Set cannot tell if the two Sue person are the same. To be able to do that I need to add the hashCode() and equals() methods.
	}
	
}
