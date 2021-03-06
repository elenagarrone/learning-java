class Frog {
	private String name; //private means that the variables are only accessible inside that class.
	private int age;
	
	public void setName(String name) {
		this.name = name; //this.name refers to the variable in the class, while name refers to the variable of setName.
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}


public class Application {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		frog1.setName("Elena");
		System.out.println(frog1.getName());
		
		frog1.setAge(26);
		System.out.println(frog1.getAge());
	
	}
}
