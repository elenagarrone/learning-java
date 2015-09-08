import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + ": " + name;
	}
	
}

//If we want to sort our list in something other than natural order I need to create a class that implement 'Comparator'.
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}



public class Application {

	public static void main(String[] args) {
		
		////////////// Sorting Strings //////////////
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongose");
		
		System.out.println("Un-sorted array: " + animals);
		
		// To sort the list above in alphabetical order we use the method 'sort()' belonging to the 'Collections' class:
		// Collections.sort(animals, new StringLengthComparator()); to implement the Comparator I add 'new StringLengthComparator()'.
		// Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		System.out.println("Sorted array:    " + animals);
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		////////////// Sorting Numbers //////////////
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		System.out.println("Un-sorted array: " + numbers);
		
		// Collections.sort(numbers);
		// If I want to sort without implementing a new class, I can use the anonymous class:
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});
		
		System.out.println("Sorted array:    " + numbers);
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		
		////////////// Sorting arbitrary objects //////////////
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Claire"));
		people.add(new Person(2, "Sue"));
		
		// Collections.sort(people); -> this won't work because the Person object doesn't have any natural order. To sort it I will have to supply a comparator.
		
		//Sort in order by ID:
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				} else if( p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
			
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
		
		System.out.println("\n ------------- \n");
		
		
		//Sort in order by name:
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		
		for(Person person: people) {
			System.out.println(person);
		}
	}
	
}
