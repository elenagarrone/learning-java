
class Person {
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	//1. Data
	//2. Subroutines (methods)
	
	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	
	void sayHello() {
		System.out.println("Hello!");
	}
}


public class Application {
	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "Elena Garrone";
		person1.age = 26;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		
		person2.name = "Peter Juhasz";
		person2.age = 32;
		person2.speak();
		person2.sayHello();
		
	}
}
