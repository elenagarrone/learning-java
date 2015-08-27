// Anonymus class are a way of either extend an existing class or implementing an interface in such a way that you can do it one time.

class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

interface Plant {
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		
		// new Machine() in this case is not actually a Machine object because it doesn't have the method start() that returns "Starting machine...".
		// new Machine() is actually a child of Machine. You can see than here I'm overriding anonymously the start() method. This approach is like doing extends on a class.
		// Since it doesn't have a name, it's a one shot thing: it can be used just once.
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera snapping...");
			}
		};
		
		machine1.start();
		
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing...");
			}
		};
		
		plant1.grow();
		
	}
	
}
