
class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	// This code produce the hash:
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Application {

	public static void main(String[] args) {
		
		System.out.println(new Object()); // Will print java.lang.Object@22aed3a5. The code after the @ is called hash.
		// An Hash is like a unique id that each object has.
		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(8, "Sue");
		Person person3 = new Person(8, "Sue");
		Person person4 = person3;
		
		// The == is comparing the objects.
		System.out.println(person1.toString() + " == " + person2.toString() + ": " + (person1 == person2));
		System.out.println(person4.toString() + " == " + person3.toString() + ": " + (person4 == person3));
		
		// The .equals() is to compare objects semantically (id, name are the same).
		// person2.equals(person3) will return false because .equals() doesn't know what to compare. Because of this we need to override the method in the Person class (source/generate hashCode() and equals()).
		System.out.println(person2.toString() + " equals() " + person3.toString() + ": " + (person2.equals(person3)));
		System.out.println(person1.toString() + " equals() " + person2.toString() + ": " + (person1.equals(person2)));		
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1.toString() + " == " + value2.toString() + ": " + (value1 == value2));
		System.out.println(value1.toString() + " equals() " + value2.toString() + ": " + (value1.equals(value2)));
		
		
		Integer number1 = 2;
		Integer number2 = 2;
		
		System.out.println(number1.toString() + " == " + number2.toString() + ": " + (number1 == number2));
		System.out.println(number1.toString() + " equals() " + number2.toString() + ": " + (number1.equals(number2)));
		
		
		String text1 = "Hello";
		String text2 = "Hello";
		String text3 = "Hello World";
		
		System.out.println(text1.toString() + " == " + text2.toString() + ": " + (text1 == text2));
		System.out.println(text1.toString() + " == " + text3.toString() + ": " + (text1 == text3));
		System.out.println(text1.toString() + " equals() " + text2.toString() + ": " + (text1.equals(text2)));
		System.out.println(text1.toString() + " equals() " + text3.toString() + ": " + (text1.equals(text3)));
		
		// Use == ONLY if you want to see if the reference point to the same object. Otherwise use .equals().
	}

}
