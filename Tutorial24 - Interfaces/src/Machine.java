
public class Machine implements Info {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Mchine started.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	}
}
