
public class Application {
	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "Hello ";
		words[1] = "to ";
		words[2] = "you";
		
		System.out.println(words[0] + words[1] + words[2]);
		
		String[] fruits = {"apple", "banana", "pear"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		int value = 0; // int is a primitive type and it is the right size to hold an integer.
		
		String text = null; // string is not allocating enough memory for a string because how would we know how big a string is going to be. It is allocating enough memory for a reference to a string; The default value for a reference is null.
		System.out.println(text);
		
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		texts[0] = "one";
	}
}
