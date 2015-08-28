/* In Java there are two basic exceptions:
 * - Checked exception are the kind that you are forced to handle;
 * - Runtime (also called Un-checked exception) are the kind that you are NOT forced to handle.
 */
public class Application {
	
	public static void main(String[] args) {
		/* This throws a checked exception which has to be handled:
		 Thread.sleep(11);
		*/
		
		/* This throws a Runtime error:
		If the program throws a runtime exception then it means that there is something seriously wrong.
		
		int value = 7;
		value = value/0;
		*/
		
		/* Null Pointer Exception (child of runtime):
		String text = null;
		 
		Cannot call a method on text because its reference points to nowhere.
		System.out.println(text.length());
		*/
		
		/* texts[3] doesn't exists. It throws a runtime error called ArrayIndexOutOfBoundsException
		String[] texts = {"one", "two", "three"};
		System.out.println(texts[3]);
		*/
		
		// It's possible to catch a runtime exception but it doesn't really make sense since the code is broken.
		
	}
	
}
