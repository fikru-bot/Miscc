package simple.java;

import java.util.Scanner;

public class LinearSearchIteratuve {
// linear search using iterative approch
	public static void main(String[] args) {
		// linear search can  work on a list weather it is sorted or not
		//a linear or sequential search will stop running when it finds its target
		//or gets to the end of the list
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
			
			int seachKeyIndex = linearSearch(inputArray,seachKey);
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
 
	//Method for linearSearch
	private static int linearSearch(int[] inputArray, int seachKey) {
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == seachKey )
				return i;
		}
		return -1;
	}

	}


