class Person {
	String name;
	int age;
	
	// Method void doesn't return anything
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	// Method int returns an integer
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name =  "Elena";
		person1.age = 26;
		person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years till retirement " + years + ".");
		
		int age = person1.getAge();
		System.out.println("My age is " + age + ".");
		
		String name = person1.getName();
		System.out.println("My name is " + name + ".");
	}
}
