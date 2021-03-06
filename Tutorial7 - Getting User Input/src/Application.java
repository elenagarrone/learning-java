import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		//--------------With a string-------------------
		// Output the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		
		// Tell them what they've entered
		System.out.println("You entered: " + line);
		
		//--------------With an integer-------------------
		
		// Output the prompt
		System.out.println("Enter an integer: ");
		
		// Wait for the user to enter a line of text
		int value = input.nextInt();
		
		// Tell them what they've entered
		System.out.println("You entered: " + value);

		//--------------With a floating point-------------------
		
		// Output the prompt
		System.out.println("Enter a floating point: ");
		
		// Wait for the user to enter a line of text
		if(input.hasNextDouble()){
			double valueDouble = input.nextDouble();
			System.out.println("You entered: " + valueDouble);
		} else {
			System.out.println("Sorry this is not a floating point");
		}
		
		input.close();
	}
}
