package simple.java;
// write a program to findout the max and the min value of the array
public class MinMaxOfArray {

	public static void main(String[] args) {
		int[] numbers = {2, 6, 7, -3, 9, -2};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			max = (numbers[i] > max) ? numbers[i] : max;
			min = (numbers[i] < min) ? numbers[i] : min;
			
		}
		System.out.println("max=" + max +"min=" + min);
		
		

	}

}
