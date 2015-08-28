// "abstract" prevent anyone to instantiate the class. The class only serves as base for other classes.
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Abstract classes can have abstract methods - this would be appropriate if I want all my child classes to have a method (for example "start") to implement it, but i don't want Machine itself to implement it because the implementation will be completely different for every particular machine.
	// I can create an abstract method like this and then add it to the child classes:
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();
	
	// Or I can create a method that call all the abstract methods and then again add them to the child class:
	public void run() {
		start();
		doStuff();
		shutDown();
	}
}
