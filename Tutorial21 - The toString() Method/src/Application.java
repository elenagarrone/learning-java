class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		// String concatenation 
		return String.format("%4d: %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}
}


public class Application {
	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Freddie");
		Frog frog2 = new Frog(5, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
		
	}
}
