import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine start.");
	}
	
}

class Camera extends Machine {
	
	@Override
	public String toString() {
		return "I am a camera";
	}
	
}

public class Application {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		
		showList(list);
		
		ArrayList<Machine> listMac1 = new ArrayList<>();
		listMac1.add(new Machine());
		listMac1.add(new Machine());
		
		// ArrayList<Camera> is not the child of ArrayList<Machine>. Only the object is.
		ArrayList<Camera> listMac2 = new ArrayList<>();
		listMac2.add(new Camera());
		listMac2.add(new Camera());
		
		showListMachine(listMac1);
		showListMachine(listMac2);
		showList2(listMac1);
	}
	
	public static void showList(ArrayList<String> list) {
		for(String value: list) {
			System.out.println(value);
		}
	}
	
	// I cannot pass the ArrayList<Camera> to ArrayList<Machine>. I have to change it ArrayList<Machine> to ArrayList<?>.
	// ? is called wildcard. So you will read ArrayList of unknown type.
	public static void showListMachine(ArrayList<?> list) { // If we want to use a specific object and it's subclasses than we can use an upper bound on the wildcard. For example: showList(ArrayList<? extends Machine>). In this case, in the for loop, I can set the type to Machine. Bare in mind that Java knows only about Machine and knows that it has some child but it doesn't know the methods contained in the child; it only knows the methods available in Machine.
		// If we change to wildcard then we have to change the type to Object:
		for(Object value : list) {
			System.out.println(value);
		}
	}
	
	// I can also specify a low bound - all we pass as argument must be Camera or a super class of Camera.
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
}
