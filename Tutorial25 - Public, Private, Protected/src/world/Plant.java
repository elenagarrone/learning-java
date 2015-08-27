package world;

public class Plant {
	// Bad practice - instance variable should be encapsulated, hide them from the rest of the world.
	public String name;
	
	// Acceptable practice is to make a variable public if it's a constant, since constants cannot be modified.
	public final static int ID = 8;
	
	private String type;
	
	// Accessible only from the class itself, subclass and the same package.
	protected String size;
	
	// If I don't specify public, protected or private, the variable will be visible at package-level.
	int height;
	
	public Plant() {
		this.name = "Freddie";
		this.type = "plant";
		this.size = "medium";
		this.height = 3;
	}
	
}
