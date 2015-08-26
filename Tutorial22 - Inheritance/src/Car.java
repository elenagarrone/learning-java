
public class Car extends Machine {
	
	@Override // This is called annotation - it will check if there really is a method start().
	public void start() {
		System.out.println("Car started!");
	}

	public void wipeWindshield() {
		System.out.println("Wiping windshield.");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
