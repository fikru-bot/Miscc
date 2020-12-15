package simple.java;

public class RaggedArrays {

	public static void main(String[] args) {
		int[][] integers = {
				{12, 43, 5},
				{1, 5, 7},
				{8, 4, 6, 8, 2, 9, 5}
		};
		printArray(integers);

	}

	private static void printArray(int[][] integers) {
		for(int i = 0; i<integers.length; i++) {
			for(int j = 0; j<integers[i].length; j++) 
				System.out.print(integers[i][j] + "");
			
			System.out.println();
			}
		
		
	}
	

}
