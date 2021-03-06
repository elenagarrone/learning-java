
public class Application {

	public static void main(String[] args) {
		
		// Inefficient - using to much memory.
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		// More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		// Append can be chained
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// There is also a SrtingBuffer class which is exactly the same as StringBuilder but is threat-safe.
	
		////// Formatting ///////////////////////////////////
		System.out.println("Here is some text: \tThat was a tab. \nThat was a new line.");
		
		System.out.printf("Total cost %10d; quantity is %d.\n", 5, 120); // printf: print format will look for each formatting character and for each of them is going to look for an argument to replace it with.
		// %10d means that that field is 10 char wide. - is used to align left.
		
		for(int i=0; i < 20; i++) {
			System.out.printf("%-2d: %s\n", i, "some text here.");
		}
		
		System.out.printf("Total value: %.2f\n", 5.687); // .2 gives two decimal places and it's also rounding it.
		System.out.printf("Total value: %5.1f\n", 345.6818727);
	}

}
