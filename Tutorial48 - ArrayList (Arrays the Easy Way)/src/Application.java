import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		// Adding
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(2));
		
		// Indexed for loop iteration
		System.out.println("\nIteration 1:");
		
		for(int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
		// Removing items (careful)
		numbers.remove(numbers.size() -1); // To remove the last one
	
		// This is very slow because it will remove the first item from the array and the move all the other items to fill the gap left by the removed item.
		numbers.remove(0);
		
		
		System.out.println("\nIteration 2:");
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		//List interface...
		
		List<String> values = new ArrayList<String>();

	}

}
