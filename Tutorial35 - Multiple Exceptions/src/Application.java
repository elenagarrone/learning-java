import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
	
	public static void main(String[] args) {

		Test test = new Test();
		
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}
		*/
		
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) { // All the exception derive from Exception. 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			test.input();
		} catch (FileNotFoundException e) { // FileNotFoundException is a child of IOException so it needs to be caught before. 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
