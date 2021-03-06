class Thing { 
	// Instance variables should always be private but for this exercise we'll set them as public for simplicity.
	public final static int LUCKY_NUMBER = 7; // final is Java version of constant. That means that you cannot re-assign a value to the constant.
	public String name; // instance variable
	public static String description; // class variables: static member variables belong to the class and there is only one copy because there is just one class.
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		count++;
	}
	
	
	public void showName() { // Instance methods can access both static and non-static variables
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}
	
	public static void showInfo() { 
		System.out.println(description); // Static method can output only static variables
	}
}

public class Application {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		System.out.println(Thing.description);
		
		Thing.showInfo(); // Static methods are run by the class
		
		System.out.println("Before creating object count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating object count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER); // Static can be used to define a constant. Constants are all uppercase.
	}

}
