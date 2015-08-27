package world;

public class Oak extends Plant {
	
	public Oak() {
		// Won't work because is private in Plant.
		// type = "tree"
		
		this.size = "large";
		
		// No access specifier. Works because Oak and Plant are in the same package.
		this.height = 10;
	}
	
}
