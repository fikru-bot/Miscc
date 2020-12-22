package simple.java;

public class BubbleSort {
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent 
//elements if they are in wrong order.
	public static void bubbleSort(int arr[]) 
    { 
        //int n = arr.length; 
        for (int i = 0; i < arr.length; i++) 
            for (int j = 1; j < arr.length; j++) 
                if (arr[j] < arr[j-1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j-1]; 
                    arr[j-1] = temp; 
                } 
    } 
  
    /* Prints the array */
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	public static void main(String[] args) {	
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        bubbleSort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 

	}

}
