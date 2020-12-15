package simple.java;

public class SelectionSort {
//The selection sort algorithm sorts an array by repeatedly finding the minimum 
//element (considering ascending order) from unsorted part and putting it at the beginning. 
//In every iteration of selection sort, the minimum element (considering ascending order) 
//from the unsorted subarray is picked and moved to the sorted subarray.
	public static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Prints the array 
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	public static void main(String[] args) { 
	        int arr[] = {64,25,12,22,11}; 
	        sort(arr); 
	        System.out.println("Sorted array"); 
	        printArray(arr); 

	}

}
