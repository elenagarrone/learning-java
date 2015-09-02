import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 4801633306273802062L;
	
	// If we don't want to serialize something we use transient.
	// If it hasn't been serialized, it will be given the default value;
	private transient int id;
	private String name;
	
	// Static fields are not serialized so count will return the default value of 0.
	private static int count;
	
	// Deserialize doesn't run the constructors.
	public Person() {
		System.out.println("Default constructor.");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two argument constructor.");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count ;
	}
}
