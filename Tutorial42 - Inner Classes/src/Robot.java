
public class Robot {

	private int id;
	
	// Non-static inner classes or nested classes - they are use when you need to group together some functionality and you need the class to have access to the instance variables of the outer class.
	
	private class Brain { // This class can be both private and public.
		public void think() {
			System.out.println("Robot " + id + " is thinking...");
		}
	}
	
	// Static inner classes - they are used when you want a normal class that isn't associated with instances of the outer class but that for some reason you want to group it with the outer class.
	
	public static class Battery {
		public void charge() {
			System.out.println("Battery charging..."); // because the class is static, we cannot refer to the id in Robot unless we were to declare id as static.
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot: " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		// We can also create classes from inside a method:
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id); // it can refer to instance data
				System.out.println("Name is: " + name); // but it can't refer to data if it's not set as 'final'.
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
