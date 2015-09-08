import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		/* A 'set' (Interface) is a kind of collection that stores only unique elements.
		   HashSet does not retain order.
		   
		   Set<String> set1 = new HashSet<String>();
		 */
		
		/* LinkedHashSet remembers the order you added items in:
		   
		   Set<String> set1 = new LinkedHashSet<String>();
		*/
		
		// TreeSet orders the items in natural order:
		Set<String> set1 = new TreeSet<String>();
		
		// Add an element to the set:
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items does nothing because a set stores unique elements:
		set1.add("mouse");
		
		// To print out the entire set:
		System.out.println(set1);
		
		
		/////// Iteration //////
		for(String element: set1) {
			System.out.println(element);
		}
		
		
		/////// Does set contains a given item? //////
		if(set1.contains("blah")) {
			System.out.println("Containes blah");
		}
		
		if(set1.contains("snake")) {
			System.out.println("Containes snake");
		}
		
		
		/////// Is the set empty? //////
		if(set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		if(!set1.isEmpty()) {
			System.out.println("Set is NOT empty");
		}
		
		
		// set2 contains some common elements with set1, and some new.
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		
		/////// Intersection //////
		
		// Find out which elements are common to the two sets:
		// First step is creating a copy of one of the set otherwise we are going to mess up the original one:
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		
		// '.retainAll(e)' will keep all the element in intersection that are also in set2:
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		
		/////// Difference //////
		
		// Find out which elements are different to the two sets:
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set2);
		
		System.out.println(difference);
		
	}

}
