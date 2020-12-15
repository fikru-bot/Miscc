package simple.java;

public class RowByRowColumnByColumn {

	public static void main(String[] args) {
		// printing arrays row by row
		int[][] integers = { {2, 3, 4}, {4, 5, 6} };
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) 
				System.out.print(integers[i][j] + "");
			System.out.println();
			}
		
		// printing arrays column by column
				int[][] numbers = { {2, 3, 4}, 
						            {4, 5, 6} 
				};
				
				for(int i = 0; i<3; i++) {
					for(int j = 0; j<2; j++) 
						System.out.print(numbers[j][i] + "");
					System.out.println();
					}
	}

}
