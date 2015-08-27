package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// It's better to specify an error than leave the stack trace.
			System.out.println("Could not open the file.");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	}

}
