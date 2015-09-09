import java.util.Iterator;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		while (it.hasNext()) {
			String animalElement = it.next();
			System.out.println(animalElement);
			
			// I can also use this to remove elements from a list while iterating (only way):
			if(animalElement.equals("cat")) {
				it.remove();
			}
		}
			
		System.out.println();
		
		/// Modern iteration, post Java 5 ///
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
	}

}
