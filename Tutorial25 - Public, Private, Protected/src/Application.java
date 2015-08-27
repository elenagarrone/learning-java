import world.Plant;

public class Application {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// Won't work because private in Plant.
		// System.out.println(plant.type);
		
		// Won't work because size is protected; Application is not in the same package as Plant.
		// System.out.println(plant.size);
		
		// Won't work because Application is not in the same package as Plant.
		// System.out.println(plant.height);
	}
}

/* --SUMMARY--
 * 
 * public      --> from anywhere;
 * private     --> only within same class;
 * protected   --> within same class, subclass and same package;
 * no modifier --> same package only;
 */
