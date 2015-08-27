class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}


public class Application {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// UPCASTING - once you've created an object of type camera or machine; those objects are always going to be whatever they are to started with: the machine will always be a machine, and so the camera, but you can change the variables that refers to them from one type to another other. 	
		Machine machine2 = camera1; // Here I took a variable of type Camera that refers to a Camera object and I've made the variable of type Machine refer to that object. So we have upcasted camera1 to machine1. We say UPcasted because we've gone up on hierarchy.
		machine2.start(); // Here the machine2 will call the Camera start method because it's the object that do stuff but is the type Machine variable that knows the methods that are available (like in the Polymorphism).
		// This won't work because the type Machine doesn't know the method snap().
		// machine2.snap();
		
		// DOWNCASTING
		Machine machine3 = new Camera();
		// So, we've seen that we cannot call machine3.snap() but we know that machine3 is referring to a Camera and that camera has a method called snap(). So to be able to call the method we can downcast like this:
		Camera camera2 = (Camera)machine3; // We have to set a new camera variable of type Camera to the machine3 but we also have to specify between the brackets to what I want to downcast (Java wants confirmation).
		camera2.snap();
		
		// Java wants confirmation to downcast because unlike upcasting, downcasting is inheritaly unsafe.
		// Machine machine4 = new Machine();
		// Camera camera3 = (Camera)machine4; // This is not possible because machine4 is a Machine object and we cannot just change what the object is.
		// camera3.start();
	}

}
