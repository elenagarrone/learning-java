
public class Application {
	public static void main(String[] args) {

		// 1D ARRAY
		int[] values = {2, 4, 5}; // one dimensional array: it needs only one number or dimension to get the array value 
		System.out.println(values[2]);
		
		// 2D ARRAY (it's just an array of arrays)
		int[][] grid = {
				{2, 4, 5},
				{2, 4},
				{9, 6, 2, 1}
		};
		
		// the 2D array is made of rows and columns. So to find a value: arrayName[row][column]. Rows and columns starts from 0.
		
		System.out.println(grid[1][1]);
		System.out.println(grid[2][3]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);
		
		// To iterate, you iterate first through the rows and then through the columns
		for(int r=0; r < grid.length; r++) {
			for(int c=0; c < grid[r].length; c++) {
				System.out.print(grid[r][c] + "\t"); // .print is to print the numbers on one line;
			}
			
			System.out.println();
		}
		
		// Specifying just the row:
		String[][] words = new String[2][];
		System.out.println(words[0]);
		// I will have to set the columns manually:
		words[0] = new String[3];
		words[0][1] = "Hi there!";
		System.out.println(words[0][1]);
	}
}
