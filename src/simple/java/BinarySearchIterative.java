package simple.java;

import java.util.Scanner;
//Binary search follows divide and conquer approach in which, the list is divided into two halves 
//and the item is compared with the middle element of the list. If the match is found then, the 
//location of middle element is returned otherwise, we search into either of the halves depending 
//upon the result produced through the match.
public class BinarySearchIterative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
	    System.out.println("Enter the size of an array");
	    int n = in.nextInt();
	 
	    // Declare an array
	    int[] arr = new int[n];
	 
	    System.out.println("Enter the values in a sorted order");
	 
	    // Input an array values
	    for (int i = 0; i < n; i++) {
	        arr[i] = in.nextInt();
	    }
	 
	    System.out.println("Enter value to be searched");
	    int num = in.nextInt();
	 
	    int low = 0;
	    int high = n - 1;
	    int mid = 0;
	 
	     //Binary Search Logic
	     while (low <= high) {
	 
	        //calculate mid 
	        mid = (low + high) / 2; 
	 
	       //If arr[mid] is equal to search element
	       if (arr[mid] == num) { 
	          System.out.print(" Value found at " + mid); 
	          break; 
	 
	       } else if (arr[mid] > num) {
	          high = mid - 1;
	 
	       } else if (arr[mid] < num) {
	         low = mid + 1;
	 
	       }
	   }
	 
	  // If value if not found
	  if (low > high) {
	      System.out.println(" Value is not found in an array ");
	   }
	 }

	}


