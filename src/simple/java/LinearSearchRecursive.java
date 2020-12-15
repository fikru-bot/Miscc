package simple.java;

import java.util.Scanner;
// java program using linearsearch recursive approach
public class LinearSearchRecursive {

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			
			System.out.println("Enter input Array Size:");
			scanner = new Scanner(System.in);
			int inputArraySize = scanner.nextInt();
			
			int inputArray[] = new int[inputArraySize];
			System.out.println("Enter " +inputArraySize+" Array Elements:");
			for (int i = 0; i < inputArray.length; i++) {
				inputArray[i]  = scanner.nextInt();
			}
			
			System.out.println("Enter Seach Key Element:");
			int seachKey = scanner.nextInt();
			
			int startIndex = 0;
			int lastIndex = inputArraySize-1;
			
			int seachKeyIndex = linearSearch(inputArray,startIndex,lastIndex,seachKey);
			if( seachKeyIndex != -1)
				System.out.println(seachKey +" found at index: "+seachKeyIndex);
			else
				System.out.println(seachKey +" not found in inputArray");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(scanner != null)
				scanner.close();
		}
		
	}
 
	// linearSearch using recursive approach
	private static int linearSearch(int[] inputArray, int startIndex, int lastIndex, int seachKey) {
		
		if(lastIndex < startIndex)
			return -1;
		if(inputArray[startIndex] == seachKey)
			return startIndex;
		
		return linearSearch(inputArray,startIndex+1,lastIndex,seachKey);
	}

	}


