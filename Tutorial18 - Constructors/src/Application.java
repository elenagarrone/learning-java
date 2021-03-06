class Machine {
	private String name;
	private int code;
	
	public Machine() { // a constructor method has to be called like the class and it will run automatically as soon as we initialize the class in the main Application.
		this("Arnie", 0); // To call a constructor inside another constructor i have to call it by using 'this' and it needs to be on the first line.
		
		System.out.println("Constructor running!");
		
	    // name = "Arnie";  // the class will be initialized with name.
	}
	
	public Machine(String name) { // I can have different constructor as long as i specify a parameter for it.
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
}

public class Application {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Bertie", 4);
		
		
	}
}
