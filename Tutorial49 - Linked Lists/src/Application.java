import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		/*
		 * ArrayList manage arrays internally.
		 * [0][1][2][3][4] ...
		 */
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next element.
		 * [0]->[1]->[2]->[3]->[4]-> ...
		 *    <-   <-   <-   <-
		 */
		
		
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// LinkedList<Integer> linkedList = new LinkedList<Integer>();
		// The only place I need to be careful to specify which type of list is after the 'new'. In fact I can write:
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		// If you want to only add or remove items from the end of the array, then use ArrayList.
		// If you want to add or remove an item from an array from any position use LinkedList.
		
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for(int i=0; i < 1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// Adding items to the end of the list:
		for(int i=0; i < 1E5; i++) {
			list.add(i);
		}
		*/
		
		// Adding items elsewhere in the array
		for(int i=0; i < 1E5; i++) {
			list.add(0, i); // Add at position 0.
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		
	}
	
}
