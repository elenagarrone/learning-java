class Plant {
	
	// ID is public but it's also a constant so that it cannot be modified.
	public static final int ID = 7;
	
	// The variable name is only accessible within the class and to modify it we use getters and setters methods. 
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData() {
		String data = "Some stuff " + calculateGrowthForecast();
		return data;
	}
	
	// This method is intended to be used within the Plant class.
	private int calculateGrowthForecast() {
		return 9;
	}
	
}

// Try to keep all the data private.


public class Application {

	public static void main(String[] args) {

	}

}
