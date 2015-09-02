
public enum Animal {
	CAT("Taylor"), DOG("Alaska"), MOUSE("Jerry"); // They are objects of the type Animal
	
	private String name;
	
	// We can give the enum type a constructor and also give methods
	// The constructor will have to be declared either private or miss it off completely:
	
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called " + name;
	}
}
