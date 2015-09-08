import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// Comparable to object type of what we want it to compare with (Person):
class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person person) { // This method works like the compare method we saw before.
		// We need to implement the hashCode() and equals() methods.
		
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		} else if(len1 < len2) {
			return -1;
		} else { 
			// this is running only when to people are equal:
			return name.compareTo(person.name); 
		}
		
	}
}

public class Application {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>(); // TreeSet is going to be automatically sorted.
		
		addElements(list);
		addElements(set);
		
		// The Person object doesn't have a natural order so the sort method will not work on it (also TreeSet will not work).
		// To be able to do that we need to define a natural order for Person.
		// We will have to add 'implements Comparable' to the class...
		Collections.sort(list);
		
		showElements(list);
		System.out.println("---------");
		showElements(set);
		
	}
	
	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Claire"));
		col.add(new Person("Mike"));
	}
	
	private static void showElements(Collection<Person> col) {
		for(Person element: col) {
			System.out.println(element);
		}
	}
		
}
