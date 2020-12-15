package simple.java;

public class ArrayOccurence {
// write a java program that displays the number of occurences of an 
//element in the the array?
	public static void main(String[] args) {
		int[] numbers = {1,2,3,2,2,2,1,1,};
		int searchElement = 2;
		System.out.println(getNumberOcc(numbers, searchElement));
		

	}
	public static int getNumberOcc(int[] numbers, int searchElement) {
		int occ = 0;
		for (int i=0; i<numbers.length; i++) {
			if(searchElement == numbers[i]) {
				occ++;
			}
			
		}
		return occ;
	}

}
