
public class Machine {
	
	protected String name = "Machine Type 1"; // I can access protected from anywhere in the packet and from any child. 
	
	public void start() {
		System.out.println("Machine started!");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
}
