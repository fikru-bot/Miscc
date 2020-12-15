package simple.java;

public class Sumof2DArrayRowColumn {

	public static void main(String[] args) {
		//calculate sum of the rows
		int[][] integers = {
				{1, 3, 5, 6},
				{5, 7, 9, 8},
				{6, 7, 3, 8}
		};
		
		for(int i =0; i < 3; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++)
				sum += integers[i][j];
			
			System.out.println("the sum of the rows " + (i + 1) + ": " + sum);
		}

	}

}
