// Abstract class is something that is going to act as a base for the other classes.
// If the other subclasses has something in common we can put the code into the base class.

public class Application {
	
	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(6);
		
		/* Machine is called abstract because we are never going to call it. Machine only act as a base for other classes.
		   I can prevent the users to instantiate a new Machine object by machine Machine class "abstract" (see code in class).
		   
		   Machine machine1 = new Machine();
		*/
		
		car1.run();
	}
	
}
