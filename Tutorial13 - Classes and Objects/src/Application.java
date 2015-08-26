
class Person {
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	//1. Data
	//2. Subroutines (methods)
}


public class Application {
	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "Elena Garrone";
		person1.age = 26;
		
		Person person2 = new Person();
		
		person2.name = "Peter Juhasz";
		person2.age = 32;
		
		System.out.println(person1.name);
		
	}
}
