package simple.java;

public class PassingArrayToMethods {

	public static void main(String[] args) {
		int[] numbers = {23, 45};
		change(numbers);
		printArray(numbers);
	}

	public static void change(int[] numbers) {
		numbers[0] = 34;
		numbers[1] = 43;
	}
	public static void printArray(int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
