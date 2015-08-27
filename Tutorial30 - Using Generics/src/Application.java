import java.util.ArrayList;
import java.util.HashMap;

// A generic class is a class that can work with other objects and you specify what type of object it can work with when you instantiate the class.

class Animal {}

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		// There can be more than one type of argument. In this case you separate the args with the comma.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Java 7 - You can miss out the argument when you create an object.
		ArrayList<Animal> someList = new ArrayList<>(); // This create an array of animals
	}

}
