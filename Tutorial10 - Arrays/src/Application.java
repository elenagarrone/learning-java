
public class Application {

	public static void main(String[] args) {
		
		int[] values;
		values = new int[3]; // amount of memory allocated is enough to hold 3 integers
		
		System.out.println(values[0]); // if you don't assign any value to the array, Java will set the default to 0.
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for (int i=0; i < values.length; i++) {
			System.out.println("First array value: " + values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		for(int i=0; i < numbers.length; i++) {
			System.out.println("Second array value: " + numbers[i]);
		}
	}

}