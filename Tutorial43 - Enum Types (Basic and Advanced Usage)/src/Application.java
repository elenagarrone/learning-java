
public class Application {
	
	public static void main(String[] args) {
		
		// "enum" is a special type that can be set to only represent certain members of a fixed set.
		Animal animal = Animal.CAT;
		
		switch(animal) {
		case CAT: // You cannot use Animal.CAT inside of the switch statement.
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		
		}
		
		System.out.println(Animal.DOG);
		// .name() is a Enum method.
		System.out.println("Enum name as a string: " + Animal.DOG.name());
		System.out.println(Animal.DOG.getClass());
		
		//istanceof operator tells us if it's an instance of a particular class or not:
		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.MOUSE.getName());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}

}
